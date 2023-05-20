@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps
import software.constructs.Construct

public fun Construct.cfnDBProxyTargetGroup(
  id: String,
  props: CfnDBProxyTargetGroupProps,
  initializer: CfnDBProxyTargetGroup.() -> Unit = {},
): CfnDBProxyTargetGroup = CfnDBProxyTargetGroup(this, id, props).apply(initializer)
