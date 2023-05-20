@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayMulticastGroupSource(
  id: String,
  props: CfnTransitGatewayMulticastGroupSourceProps,
  initializer: CfnTransitGatewayMulticastGroupSource.() -> Unit = {},
): CfnTransitGatewayMulticastGroupSource = CfnTransitGatewayMulticastGroupSource(this, id,
    props).apply(initializer)
