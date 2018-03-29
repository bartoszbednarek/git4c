package com.networkedassets.git4c.core

import com.github.kittinunf.result.Result
import com.networkedassets.git4c.application.BussinesPluginComponents
import com.networkedassets.git4c.boundary.GetDocumentationsMacroViewTemplateQuery
import com.networkedassets.git4c.delivery.executor.execution.UseCase
import org.apache.commons.io.IOUtils


class GetDocumentationsMacroViewTemplateUseCase(
        components: BussinesPluginComponents
) : UseCase<GetDocumentationsMacroViewTemplateQuery, String>
(components) {

    override fun execute(request: GetDocumentationsMacroViewTemplateQuery): Result<String, Exception> {

        val content = IOUtils.toString(this.javaClass.classLoader.getResourceAsStream("/${request.type}/index.html"), "UTF-8")
                .split("<cut-me-confluence>".toRegex())
                .dropLastWhile { it.isEmpty() }.toTypedArray()[1]
                .split("</cut-me-confluence>".toRegex())
                .dropLastWhile { it.isEmpty() }.toTypedArray()[0]

        return Result.of(content)
    }
}