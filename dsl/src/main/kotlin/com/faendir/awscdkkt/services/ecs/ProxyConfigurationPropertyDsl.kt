package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun proxyConfigurationProperty(initializer: CfnTaskDefinition.ProxyConfigurationProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.ProxyConfigurationProperty =
    CfnTaskDefinition.ProxyConfigurationProperty.builder().apply(initializer).build()
