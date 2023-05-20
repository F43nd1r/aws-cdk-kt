@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
