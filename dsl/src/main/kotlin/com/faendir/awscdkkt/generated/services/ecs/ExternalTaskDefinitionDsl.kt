package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExternalTaskDefinition
import software.amazon.awscdk.services.ecs.ExternalTaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.externalTaskDefinition(id: String, initializer: @AwsCdkDsl
    ExternalTaskDefinition.() -> Unit = {}): ExternalTaskDefinition = ExternalTaskDefinition(this,
    id).apply(initializer)

@Generated
public fun Construct.externalTaskDefinition(
  id: String,
  props: ExternalTaskDefinitionProps,
  initializer: @AwsCdkDsl ExternalTaskDefinition.() -> Unit = {},
): ExternalTaskDefinition = ExternalTaskDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildExternalTaskDefinition(id: String, initializer: @AwsCdkDsl
    ExternalTaskDefinition.Builder.() -> Unit = {}): ExternalTaskDefinition =
    ExternalTaskDefinition.Builder.create(this, id).apply(initializer).build()
