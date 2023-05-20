@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnRoute
import software.amazon.awscdk.services.ec2.CfnRouteProps
import software.constructs.Construct

public fun Construct.cfnRoute(
  id: String,
  props: CfnRouteProps,
  initializer: CfnRoute.() -> Unit = {},
): CfnRoute = CfnRoute(this, id, props).apply(initializer)
