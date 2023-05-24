package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnGlobalCluster
import software.amazon.awscdk.services.rds.CfnGlobalClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGlobalCluster(id: String): CfnGlobalCluster = CfnGlobalCluster(this, id)

@Generated
public fun Construct.cfnGlobalCluster(id: String, initializer: @AwsCdkDsl
    CfnGlobalCluster.() -> Unit): CfnGlobalCluster = CfnGlobalCluster(this, id).apply(initializer)

@Generated
public fun Construct.cfnGlobalCluster(id: String, props: CfnGlobalClusterProps): CfnGlobalCluster =
    CfnGlobalCluster(this, id, props)

@Generated
public fun Construct.cfnGlobalCluster(
  id: String,
  props: CfnGlobalClusterProps,
  initializer: @AwsCdkDsl CfnGlobalCluster.() -> Unit,
): CfnGlobalCluster = CfnGlobalCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGlobalCluster(id: String, initializer: @AwsCdkDsl
    CfnGlobalCluster.Builder.() -> Unit): CfnGlobalCluster = CfnGlobalCluster.Builder.create(this,
    id).apply(initializer).build()
