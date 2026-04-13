package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnDaemon
import software.amazon.awscdk.services.ecs.CfnDaemonProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDaemon(id: String, initializer: @AwsCdkDsl CfnDaemon.() -> Unit = {}): CfnDaemon = CfnDaemon(this, id).apply(initializer)

@Generated
public fun Construct.cfnDaemon(
  id: String,
  props: CfnDaemonProps,
  initializer: @AwsCdkDsl CfnDaemon.() -> Unit = {},
): CfnDaemon = CfnDaemon(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDaemon(id: String, initializer: @AwsCdkDsl CfnDaemon.Builder.() -> Unit = {}): CfnDaemon = CfnDaemon.Builder.create(this, id).apply(initializer).build()
