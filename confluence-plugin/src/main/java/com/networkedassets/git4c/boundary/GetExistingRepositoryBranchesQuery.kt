package com.networkedassets.git4c.boundary

import com.networkedassets.git4c.core.usecase.async.AsyncBackendRequest


class GetExistingRepositoryBranchesQuery(
        val repositoryUuid: String
) : AsyncBackendRequest()