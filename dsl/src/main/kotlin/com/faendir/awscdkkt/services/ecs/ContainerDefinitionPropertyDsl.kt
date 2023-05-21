package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun containerDefinitionProperty(initializer: CfnTaskDefinition.ContainerDefinitionProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.ContainerDefinitionProperty =
    CfnTaskDefinition.ContainerDefinitionProperty.builder().apply(initializer).build()
