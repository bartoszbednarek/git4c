package com.networkedassets.git4c.boundary

import com.networkedassets.git4c.core.usecase.async.AsyncBackendRequest

class GetPredefinedRepositoryCommand(
        val repositoryId: String
) : AsyncBackendRequest()