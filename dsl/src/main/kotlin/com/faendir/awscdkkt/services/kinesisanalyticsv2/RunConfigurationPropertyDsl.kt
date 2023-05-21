package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun runConfigurationProperty(initializer: CfnApplication.RunConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.RunConfigurationProperty =
    CfnApplication.RunConfigurationProperty.builder().apply(initializer).build()
