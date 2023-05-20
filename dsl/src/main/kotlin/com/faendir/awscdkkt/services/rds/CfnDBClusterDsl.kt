@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBCluster
import software.amazon.awscdk.services.rds.CfnDBClusterProps
import software.constructs.Construct

public fun Construct.cfnDBCluster(id: String, initializer: CfnDBCluster.() -> Unit = {}):
    CfnDBCluster = CfnDBCluster(this, id).apply(initializer)

public fun Construct.cfnDBCluster(
  id: String,
  props: CfnDBClusterProps,
  initializer: CfnDBCluster.() -> Unit = {},
): CfnDBCluster = CfnDBCluster(this, id, props).apply(initializer)
