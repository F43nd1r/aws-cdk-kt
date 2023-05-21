package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun applicationConfigurationProperty(initializer: CfnApplication.ApplicationConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.ApplicationConfigurationProperty =
    CfnApplication.ApplicationConfigurationProperty.builder().apply(initializer).build()
