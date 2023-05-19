@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps
import software.constructs.Construct

public fun Construct.cfnVPNConnectionRoute(
  id: String,
  props: CfnVPNConnectionRouteProps,
  initializer: CfnVPNConnectionRoute.() -> Unit = {},
): CfnVPNConnectionRoute = CfnVPNConnectionRoute(this, id, props).apply(initializer)
