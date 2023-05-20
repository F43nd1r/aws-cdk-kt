@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

public
    fun containerDefinitionProperty(initializer: CfnTaskDefinition.ContainerDefinitionProperty.Builder.() -> Unit):
    CfnTaskDefinition.ContainerDefinitionProperty =
    CfnTaskDefinition.ContainerDefinitionProperty.builder().apply(initializer).build()
