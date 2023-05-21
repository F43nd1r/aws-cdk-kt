package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun inputProcessingConfigurationProperty(initializer: CfnApplication.InputProcessingConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.InputProcessingConfigurationProperty =
    CfnApplication.InputProcessingConfigurationProperty.builder().apply(initializer).build()
