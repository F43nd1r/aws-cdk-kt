package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun parallelismConfigurationProperty(initializer: CfnApplicationV2.ParallelismConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.ParallelismConfigurationProperty =
    CfnApplicationV2.ParallelismConfigurationProperty.builder().apply(initializer).build()
