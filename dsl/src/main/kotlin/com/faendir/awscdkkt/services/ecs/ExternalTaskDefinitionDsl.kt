@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExternalTaskDefinition
import software.amazon.awscdk.services.ecs.ExternalTaskDefinitionProps
import software.constructs.Construct

public fun Construct.externalTaskDefinition(id: String,
    initializer: ExternalTaskDefinition.() -> Unit = {}): ExternalTaskDefinition =
    ExternalTaskDefinition(this, id).apply(initializer)

public fun Construct.externalTaskDefinition(
  id: String,
  props: ExternalTaskDefinitionProps,
  initializer: ExternalTaskDefinition.() -> Unit = {},
): ExternalTaskDefinition = ExternalTaskDefinition(this, id, props).apply(initializer)
