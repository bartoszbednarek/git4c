package com.networkedassets.git4c.boundary

import com.networkedassets.git4c.delivery.executor.result.BackendRequest


class GetDocumentationsMacroViewTemplateQuery(
        val type: String
) : BackendRequest<String>()