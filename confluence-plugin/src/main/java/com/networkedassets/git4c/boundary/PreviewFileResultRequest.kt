package com.networkedassets.git4c.boundary

import com.networkedassets.git4c.boundary.outbound.FileContent
import com.networkedassets.git4c.core.usecase.async.BackendRequestForAsyncResult


class PreviewFileResultRequest(requestId: String) : BackendRequestForAsyncResult<FileContent>(requestId)