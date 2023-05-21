package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnGateway
import software.amazon.awscdk.services.ec2.VpnGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.vpnGateway(
  id: String,
  props: VpnGatewayProps,
  initializer: VpnGateway.() -> Unit = {},
): VpnGateway = VpnGateway(this, id, props).apply(initializer)
