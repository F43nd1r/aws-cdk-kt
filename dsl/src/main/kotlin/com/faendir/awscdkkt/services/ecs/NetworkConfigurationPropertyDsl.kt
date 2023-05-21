package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet

@Generated
public
    fun networkConfigurationProperty(initializer: CfnTaskSet.NetworkConfigurationProperty.Builder.() -> Unit
    = {}): CfnTaskSet.NetworkConfigurationProperty =
    CfnTaskSet.NetworkConfigurationProperty.builder().apply(initializer).build()
