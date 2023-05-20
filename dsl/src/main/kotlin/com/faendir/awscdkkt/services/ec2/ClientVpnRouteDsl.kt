@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnRoute
import software.amazon.awscdk.services.ec2.ClientVpnRouteProps
import software.constructs.Construct

public fun Construct.clientVpnRoute(
  id: String,
  props: ClientVpnRouteProps,
  initializer: ClientVpnRoute.() -> Unit = {},
): ClientVpnRoute = ClientVpnRoute(this, id, props).apply(initializer)
