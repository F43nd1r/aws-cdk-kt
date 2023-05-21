package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPNGatewayRoutePropagation(
  id: String,
  props: CfnVPNGatewayRoutePropagationProps,
  initializer: CfnVPNGatewayRoutePropagation.() -> Unit = {},
): CfnVPNGatewayRoutePropagation = CfnVPNGatewayRoutePropagation(this, id, props).apply(initializer)
