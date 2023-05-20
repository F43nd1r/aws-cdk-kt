@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps
import software.constructs.Construct

public fun Construct.cfnVPNGatewayRoutePropagation(
  id: String,
  props: CfnVPNGatewayRoutePropagationProps,
  initializer: CfnVPNGatewayRoutePropagation.() -> Unit = {},
): CfnVPNGatewayRoutePropagation = CfnVPNGatewayRoutePropagation(this, id, props).apply(initializer)
