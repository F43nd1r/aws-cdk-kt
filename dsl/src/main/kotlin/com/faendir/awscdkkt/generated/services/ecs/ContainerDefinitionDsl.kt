package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.ecs.ContainerDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.containerDefinition(
  id: String,
  props: ContainerDefinitionProps,
  initializer: @AwsCdkDsl ContainerDefinition.() -> Unit = {},
): ContainerDefinition = ContainerDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildContainerDefinition(id: String, initializer: @AwsCdkDsl
    ContainerDefinition.Builder.() -> Unit = {}): ContainerDefinition =
    ContainerDefinition.Builder.create(this, id).apply(initializer).build()
