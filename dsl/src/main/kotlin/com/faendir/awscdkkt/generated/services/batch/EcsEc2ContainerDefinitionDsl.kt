package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.EcsEc2ContainerDefinition
import software.amazon.awscdk.services.batch.EcsEc2ContainerDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.ecsEc2ContainerDefinition(
  id: String,
  props: EcsEc2ContainerDefinitionProps,
  initializer: @AwsCdkDsl EcsEc2ContainerDefinition.() -> Unit = {},
): EcsEc2ContainerDefinition = EcsEc2ContainerDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEcsEc2ContainerDefinition(id: String, initializer: @AwsCdkDsl EcsEc2ContainerDefinition.Builder.() -> Unit = {}): EcsEc2ContainerDefinition = EcsEc2ContainerDefinition.Builder.create(this, id).apply(initializer).build()
