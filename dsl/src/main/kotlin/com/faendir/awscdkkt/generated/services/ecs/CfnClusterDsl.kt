package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster
import software.amazon.awscdk.services.ecs.CfnClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCluster(id: String, initializer: @AwsCdkDsl CfnCluster.() -> Unit = {}):
    CfnCluster = CfnCluster(this, id).apply(initializer)

@Generated
public fun Construct.cfnCluster(
  id: String,
  props: CfnClusterProps,
  initializer: @AwsCdkDsl CfnCluster.() -> Unit = {},
): CfnCluster = CfnCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCluster(id: String, initializer: @AwsCdkDsl
    CfnCluster.Builder.() -> Unit = {}): CfnCluster = CfnCluster.Builder.create(this,
    id).apply(initializer).build()
