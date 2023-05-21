package com.faendir.awscdkkt.services.resourcegroups

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.resourcegroups.CfnGroup

@Generated
public
    fun configurationParameterProperty(initializer: CfnGroup.ConfigurationParameterProperty.Builder.() -> Unit
    = {}): CfnGroup.ConfigurationParameterProperty =
    CfnGroup.ConfigurationParameterProperty.builder().apply(initializer).build()
