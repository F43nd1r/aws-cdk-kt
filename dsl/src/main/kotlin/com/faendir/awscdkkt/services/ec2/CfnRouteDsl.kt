@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
