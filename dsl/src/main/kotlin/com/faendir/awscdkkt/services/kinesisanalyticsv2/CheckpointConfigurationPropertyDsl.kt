package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun checkpointConfigurationProperty(initializer: CfnApplication.CheckpointConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.CheckpointConfigurationProperty =
    CfnApplication.CheckpointConfigurationProperty.builder().apply(initializer).build()
