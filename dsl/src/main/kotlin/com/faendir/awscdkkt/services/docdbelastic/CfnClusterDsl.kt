@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.docdbelastic

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdbelastic.CfnCluster
import software.amazon.awscdk.services.docdbelastic.CfnClusterProps
import software.constructs.Construct

public fun Construct.cfnCluster(
  id: String,
  props: CfnClusterProps,
  initializer: CfnCluster.() -> Unit = {},
): CfnCluster = CfnCluster(this, id, props).apply(initializer)
