package com.faendir.awscdkkt.services.applicationinsights

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@Generated
public
    fun componentConfigurationProperty(initializer: CfnApplication.ComponentConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.ComponentConfigurationProperty =
    CfnApplication.ComponentConfigurationProperty.builder().apply(initializer).build()
