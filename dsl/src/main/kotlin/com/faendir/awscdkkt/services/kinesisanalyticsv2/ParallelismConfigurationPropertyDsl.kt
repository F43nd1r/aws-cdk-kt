package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun parallelismConfigurationProperty(initializer: CfnApplication.ParallelismConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.ParallelismConfigurationProperty =
    CfnApplication.ParallelismConfigurationProperty.builder().apply(initializer).build()
