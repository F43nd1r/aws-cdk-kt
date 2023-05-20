@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayMulticastDomain(
  id: String,
  props: CfnTransitGatewayMulticastDomainProps,
  initializer: CfnTransitGatewayMulticastDomain.() -> Unit = {},
): CfnTransitGatewayMulticastDomain = CfnTransitGatewayMulticastDomain(this, id,
    props).apply(initializer)
