@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53recoverycontrol

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnCluster
import software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps
import software.constructs.Construct

public fun Construct.cfnCluster(
  id: String,
  props: CfnClusterProps,
  initializer: CfnCluster.() -> Unit = {},
): CfnCluster = CfnCluster(this, id, props).apply(initializer)
