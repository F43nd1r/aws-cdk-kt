package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExternalTaskDefinition
import software.amazon.awscdk.services.ecs.ExternalTaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.externalTaskDefinition(id: String,
    initializer: ExternalTaskDefinition.() -> Unit = {}): ExternalTaskDefinition =
    ExternalTaskDefinition(this, id).apply(initializer)

@Generated
public fun Construct.externalTaskDefinition(
  id: String,
  props: ExternalTaskDefinitionProps,
  initializer: ExternalTaskDefinition.() -> Unit = {},
): ExternalTaskDefinition = ExternalTaskDefinition(this, id, props).apply(initializer)
