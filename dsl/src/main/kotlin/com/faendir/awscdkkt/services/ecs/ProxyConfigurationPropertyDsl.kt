@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

public
    fun proxyConfigurationProperty(initializer: CfnTaskDefinition.ProxyConfigurationProperty.Builder.() -> Unit):
    CfnTaskDefinition.ProxyConfigurationProperty =
    CfnTaskDefinition.ProxyConfigurationProperty.builder().apply(initializer).build()
