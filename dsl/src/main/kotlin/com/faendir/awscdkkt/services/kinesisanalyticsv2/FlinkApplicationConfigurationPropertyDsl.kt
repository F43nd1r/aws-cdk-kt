package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun flinkApplicationConfigurationProperty(initializer: CfnApplication.FlinkApplicationConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.FlinkApplicationConfigurationProperty =
    CfnApplication.FlinkApplicationConfigurationProperty.builder().apply(initializer).build()
