@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayRouteTableAttachment(
  id: String,
  props: CfnTransitGatewayRouteTableAttachmentProps,
  initializer: CfnTransitGatewayRouteTableAttachment.() -> Unit = {},
): CfnTransitGatewayRouteTableAttachment = CfnTransitGatewayRouteTableAttachment(this, id,
    props).apply(initializer)
