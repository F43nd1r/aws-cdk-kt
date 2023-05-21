package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnPipelineProps

@Generated
public fun cfnPipelineProps(initializer: CfnPipelineProps.Builder.() -> Unit = {}): CfnPipelineProps
    = CfnPipelineProps.builder().apply(initializer).build()
