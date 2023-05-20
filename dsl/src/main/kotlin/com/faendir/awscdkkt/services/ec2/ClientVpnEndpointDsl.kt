@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnEndpoint
import software.amazon.awscdk.services.ec2.ClientVpnEndpointProps
import software.constructs.Construct

public fun Construct.clientVpnEndpoint(
  id: String,
  props: ClientVpnEndpointProps,
  initializer: ClientVpnEndpoint.() -> Unit = {},
): ClientVpnEndpoint = ClientVpnEndpoint(this, id, props).apply(initializer)
