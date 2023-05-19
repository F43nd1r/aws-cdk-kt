@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.ecs.ContainerDefinitionProps
import software.constructs.Construct

public fun Construct.containerDefinition(
  id: String,
  props: ContainerDefinitionProps,
  initializer: ContainerDefinition.() -> Unit = {},
): ContainerDefinition = ContainerDefinition(this, id, props).apply(initializer)
