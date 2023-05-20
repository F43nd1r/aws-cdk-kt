@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
