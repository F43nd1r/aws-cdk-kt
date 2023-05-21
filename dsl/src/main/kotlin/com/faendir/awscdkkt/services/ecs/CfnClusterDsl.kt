package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster
import software.amazon.awscdk.services.ecs.CfnClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCluster(id: String, initializer: CfnCluster.() -> Unit = {}): CfnCluster =
    CfnCluster(this, id).apply(initializer)

@Generated
public fun Construct.cfnCluster(
  id: String,
  props: CfnClusterProps,
  initializer: CfnCluster.() -> Unit = {},
): CfnCluster = CfnCluster(this, id, props).apply(initializer)
