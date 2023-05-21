package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.gatewayVpcEndpoint(
  id: String,
  props: GatewayVpcEndpointProps,
  initializer: GatewayVpcEndpoint.() -> Unit = {},
): GatewayVpcEndpoint = GatewayVpcEndpoint(this, id, props).apply(initializer)
