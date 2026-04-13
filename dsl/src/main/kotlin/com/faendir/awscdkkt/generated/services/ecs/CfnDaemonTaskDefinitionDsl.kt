package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnDaemonTaskDefinition
import software.amazon.awscdk.services.ecs.CfnDaemonTaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDaemonTaskDefinition(id: String, initializer: @AwsCdkDsl CfnDaemonTaskDefinition.() -> Unit = {}): CfnDaemonTaskDefinition = CfnDaemonTaskDefinition(this, id).apply(initializer)

@Generated
public fun Construct.cfnDaemonTaskDefinition(
  id: String,
  props: CfnDaemonTaskDefinitionProps,
  initializer: @AwsCdkDsl CfnDaemonTaskDefinition.() -> Unit = {},
): CfnDaemonTaskDefinition = CfnDaemonTaskDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDaemonTaskDefinition(id: String, initializer: @AwsCdkDsl CfnDaemonTaskDefinition.Builder.() -> Unit = {}): CfnDaemonTaskDefinition = CfnDaemonTaskDefinition.Builder.create(this, id).apply(initializer).build()
