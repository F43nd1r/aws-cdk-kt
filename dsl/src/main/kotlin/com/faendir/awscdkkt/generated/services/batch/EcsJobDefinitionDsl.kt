package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.EcsJobDefinition
import software.amazon.awscdk.services.batch.EcsJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.ecsJobDefinition(
  id: String,
  props: EcsJobDefinitionProps,
  initializer: @AwsCdkDsl EcsJobDefinition.() -> Unit = {},
): EcsJobDefinition = EcsJobDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEcsJobDefinition(id: String, initializer: @AwsCdkDsl EcsJobDefinition.Builder.() -> Unit = {}): EcsJobDefinition = EcsJobDefinition.Builder.create(this, id).apply(initializer).build()
