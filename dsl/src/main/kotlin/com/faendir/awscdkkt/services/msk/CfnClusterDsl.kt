@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster
import software.amazon.awscdk.services.msk.CfnClusterProps
import software.constructs.Construct

public fun Construct.cfnCluster(
  id: String,
  props: CfnClusterProps,
  initializer: CfnCluster.() -> Unit = {},
): CfnCluster = CfnCluster(this, id, props).apply(initializer)
