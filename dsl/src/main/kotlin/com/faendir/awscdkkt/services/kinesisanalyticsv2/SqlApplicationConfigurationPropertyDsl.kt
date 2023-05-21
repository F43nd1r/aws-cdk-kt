package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun sqlApplicationConfigurationProperty(initializer: CfnApplication.SqlApplicationConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.SqlApplicationConfigurationProperty =
    CfnApplication.SqlApplicationConfigurationProperty.builder().apply(initializer).build()
