package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun monitoringConfigurationProperty(initializer: CfnApplication.MonitoringConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.MonitoringConfigurationProperty =
    CfnApplication.MonitoringConfigurationProperty.builder().apply(initializer).build()
