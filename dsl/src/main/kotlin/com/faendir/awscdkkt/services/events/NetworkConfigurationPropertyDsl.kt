package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun networkConfigurationProperty(initializer: CfnRule.NetworkConfigurationProperty.Builder.() -> Unit
    = {}): CfnRule.NetworkConfigurationProperty =
    CfnRule.NetworkConfigurationProperty.builder().apply(initializer).build()
