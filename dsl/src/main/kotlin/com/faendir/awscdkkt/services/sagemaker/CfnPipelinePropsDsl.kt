package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnPipelineProps

@Generated
public fun cfnPipelineProps(initializer: CfnPipelineProps.Builder.() -> Unit = {}): CfnPipelineProps
    = CfnPipelineProps.builder().apply(initializer).build()
