@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.CfnDBCluster
import software.amazon.awscdk.services.docdb.CfnDBClusterProps
import software.constructs.Construct

public fun Construct.cfnDBCluster(id: String, initializer: CfnDBCluster.() -> Unit = {}):
    CfnDBCluster = CfnDBCluster(this, id).apply(initializer)

public fun Construct.cfnDBCluster(
  id: String,
  props: CfnDBClusterProps,
  initializer: CfnDBCluster.() -> Unit = {},
): CfnDBCluster = CfnDBCluster(this, id, props).apply(initializer)
