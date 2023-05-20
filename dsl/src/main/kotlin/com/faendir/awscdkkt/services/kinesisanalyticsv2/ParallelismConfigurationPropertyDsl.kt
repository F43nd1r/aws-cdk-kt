@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

public
    fun parallelismConfigurationProperty(initializer: CfnApplication.ParallelismConfigurationProperty.Builder.() -> Unit):
    CfnApplication.ParallelismConfigurationProperty =
    CfnApplication.ParallelismConfigurationProperty.builder().apply(initializer).build()
