package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun applicationCodeConfigurationProperty(initializer: CfnApplication.ApplicationCodeConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.ApplicationCodeConfigurationProperty =
    CfnApplication.ApplicationCodeConfigurationProperty.builder().apply(initializer).build()
