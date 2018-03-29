package com.networkedassets.git4c.core

import com.github.kittinunf.result.Result
import com.networkedassets.git4c.application.BussinesPluginComponents
import com.networkedassets.git4c.boundary.GetForceUsersToUsePredefinedRepositoriesSettingQuery
import com.networkedassets.git4c.boundary.outbound.isForcedPredefined
import com.networkedassets.git4c.core.datastore.repositories.PluginSettingsDatabase
import com.networkedassets.git4c.delivery.executor.execution.UseCase


class GetForceUsersToUsePredefinedRepositoriesSettingUseCase(
        components: BussinesPluginComponents,
        val pluginSettings: PluginSettingsDatabase = components.database.pluginSettings
) : UseCase<GetForceUsersToUsePredefinedRepositoriesSettingQuery, isForcedPredefined>
(components) {

    override fun execute(request: GetForceUsersToUsePredefinedRepositoriesSettingQuery): Result<isForcedPredefined, Exception> {
        val isForced = pluginSettings.getForcePredefinedRepositoriesSetting()
        if (isForced != null) {
            //Compilator still thinks that isForcedPredefined can be null even after null checking
            @Suppress("UNNECESSARY_NOT_NULL_ASSERTION")
            val isForcedNotNull = isForced!!
            return Result.of { isForcedPredefined(isForcedNotNull) }
        } else {
            pluginSettings.setForcePredefinedRepositories(false)
            return Result.of { isForcedPredefined(false) }
        }
    }

}