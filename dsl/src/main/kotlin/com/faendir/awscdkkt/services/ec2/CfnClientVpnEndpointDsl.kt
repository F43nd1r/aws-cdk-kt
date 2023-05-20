@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps
import software.constructs.Construct

public fun Construct.cfnClientVpnEndpoint(
  id: String,
  props: CfnClientVpnEndpointProps,
  initializer: CfnClientVpnEndpoint.() -> Unit = {},
): CfnClientVpnEndpoint = CfnClientVpnEndpoint(this, id, props).apply(initializer)
