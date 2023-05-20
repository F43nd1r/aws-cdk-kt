@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.neptune

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBCluster
import software.amazon.awscdk.services.neptune.CfnDBClusterProps
import software.constructs.Construct

public fun Construct.cfnDBCluster(id: String, initializer: CfnDBCluster.() -> Unit = {}):
    CfnDBCluster = CfnDBCluster(this, id).apply(initializer)

public fun Construct.cfnDBCluster(
  id: String,
  props: CfnDBClusterProps,
  initializer: CfnDBCluster.() -> Unit = {},
): CfnDBCluster = CfnDBCluster(this, id, props).apply(initializer)
