@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

public
    fun proxyConfigurationProperty(initializer: CfnTaskDefinition.ProxyConfigurationProperty.Builder.() -> Unit):
    CfnTaskDefinition.ProxyConfigurationProperty =
    CfnTaskDefinition.ProxyConfigurationProperty.builder().apply(initializer).build()
