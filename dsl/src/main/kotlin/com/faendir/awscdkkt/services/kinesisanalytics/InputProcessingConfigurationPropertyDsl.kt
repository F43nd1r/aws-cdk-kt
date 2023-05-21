package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun inputProcessingConfigurationProperty(initializer: CfnApplicationV2.InputProcessingConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.InputProcessingConfigurationProperty =
    CfnApplicationV2.InputProcessingConfigurationProperty.builder().apply(initializer).build()
