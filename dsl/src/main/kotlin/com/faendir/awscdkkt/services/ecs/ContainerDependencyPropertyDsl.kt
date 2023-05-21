package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun containerDependencyProperty(initializer: CfnTaskDefinition.ContainerDependencyProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.ContainerDependencyProperty =
    CfnTaskDefinition.ContainerDependencyProperty.builder().apply(initializer).build()
