package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnGlobalCluster
import software.amazon.awscdk.services.rds.CfnGlobalClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGlobalCluster(id: String, initializer: CfnGlobalCluster.() -> Unit = {}):
    CfnGlobalCluster = CfnGlobalCluster(this, id).apply(initializer)

@Generated
public fun Construct.cfnGlobalCluster(
  id: String,
  props: CfnGlobalClusterProps,
  initializer: CfnGlobalCluster.() -> Unit = {},
): CfnGlobalCluster = CfnGlobalCluster(this, id, props).apply(initializer)
