@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnPipeline

public
    fun parallelismConfigurationProperty(initializer: CfnPipeline.ParallelismConfigurationProperty.Builder.() -> Unit):
    CfnPipeline.ParallelismConfigurationProperty =
    CfnPipeline.ParallelismConfigurationProperty.builder().apply(initializer).build()
