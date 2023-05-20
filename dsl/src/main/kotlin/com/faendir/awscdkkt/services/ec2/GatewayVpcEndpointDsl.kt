@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps
import software.constructs.Construct

public fun Construct.gatewayVpcEndpoint(
  id: String,
  props: GatewayVpcEndpointProps,
  initializer: GatewayVpcEndpoint.() -> Unit = {},
): GatewayVpcEndpoint = GatewayVpcEndpoint(this, id, props).apply(initializer)
