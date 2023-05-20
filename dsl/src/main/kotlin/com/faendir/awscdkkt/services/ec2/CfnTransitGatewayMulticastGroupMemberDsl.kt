@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMember
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupMemberProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayMulticastGroupMember(
  id: String,
  props: CfnTransitGatewayMulticastGroupMemberProps,
  initializer: CfnTransitGatewayMulticastGroupMember.() -> Unit = {},
): CfnTransitGatewayMulticastGroupMember = CfnTransitGatewayMulticastGroupMember(this, id,
    props).apply(initializer)
