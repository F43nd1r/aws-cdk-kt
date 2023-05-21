package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodePipelineProps

@Generated
public fun codePipelineProps(initializer: CodePipelineProps.Builder.() -> Unit = {}):
    CodePipelineProps = CodePipelineProps.builder().apply(initializer).build()
