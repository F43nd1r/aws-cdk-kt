@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
