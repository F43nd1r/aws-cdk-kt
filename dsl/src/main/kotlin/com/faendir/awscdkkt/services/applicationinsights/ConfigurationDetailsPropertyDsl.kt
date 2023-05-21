package com.faendir.awscdkkt.services.applicationinsights

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@Generated
public
    fun configurationDetailsProperty(initializer: CfnApplication.ConfigurationDetailsProperty.Builder.() -> Unit
    = {}): CfnApplication.ConfigurationDetailsProperty =
    CfnApplication.ConfigurationDetailsProperty.builder().apply(initializer).build()
