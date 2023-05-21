package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.PipelineProps

@Generated
public fun pipelineProps(initializer: PipelineProps.Builder.() -> Unit = {}): PipelineProps =
    PipelineProps.builder().apply(initializer).build()
