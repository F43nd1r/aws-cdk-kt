package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnRoute
import software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClientVpnRoute(
  id: String,
  props: CfnClientVpnRouteProps,
  initializer: CfnClientVpnRoute.() -> Unit = {},
): CfnClientVpnRoute = CfnClientVpnRoute(this, id, props).apply(initializer)
