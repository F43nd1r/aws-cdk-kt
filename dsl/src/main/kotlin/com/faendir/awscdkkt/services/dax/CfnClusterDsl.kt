@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dax

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnCluster
import software.amazon.awscdk.services.dax.CfnClusterProps
import software.constructs.Construct

public fun Construct.cfnCluster(
  id: String,
  props: CfnClusterProps,
  initializer: CfnCluster.() -> Unit = {},
): CfnCluster = CfnCluster(this, id, props).apply(initializer)
