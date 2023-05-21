package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult

@Generated
public
    fun codePipelineActionFactoryResult(initializer: CodePipelineActionFactoryResult.Builder.() -> Unit
    = {}): CodePipelineActionFactoryResult =
    CodePipelineActionFactoryResult.builder().apply(initializer).build()
