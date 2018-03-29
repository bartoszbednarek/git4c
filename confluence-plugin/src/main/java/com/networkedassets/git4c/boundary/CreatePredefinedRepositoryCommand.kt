package com.networkedassets.git4c.boundary

import com.networkedassets.git4c.boundary.inbound.PredefinedRepository
import com.networkedassets.git4c.core.usecase.async.AsyncBackendRequest

class CreatePredefinedRepositoryCommand(
        val predefinedRepositoryToCreate: PredefinedRepository
) : AsyncBackendRequest()