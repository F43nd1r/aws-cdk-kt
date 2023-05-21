package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun checkpointConfigurationProperty(initializer: CfnApplicationV2.CheckpointConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.CheckpointConfigurationProperty =
    CfnApplicationV2.CheckpointConfigurationProperty.builder().apply(initializer).build()
