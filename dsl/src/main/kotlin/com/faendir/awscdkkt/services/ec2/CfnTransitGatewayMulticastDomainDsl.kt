@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
