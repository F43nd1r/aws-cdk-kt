package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnPipeline

@Generated
public
    fun parallelismConfigurationProperty(initializer: CfnPipeline.ParallelismConfigurationProperty.Builder.() -> Unit
    = {}): CfnPipeline.ParallelismConfigurationProperty =
    CfnPipeline.ParallelismConfigurationProperty.builder().apply(initializer).build()
