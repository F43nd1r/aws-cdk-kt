@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnConnection
import software.amazon.awscdk.services.ec2.VpnConnectionProps
import software.constructs.Construct

public fun Construct.vpnConnection(
  id: String,
  props: VpnConnectionProps,
  initializer: VpnConnection.() -> Unit = {},
): VpnConnection = VpnConnection(this, id, props).apply(initializer)
