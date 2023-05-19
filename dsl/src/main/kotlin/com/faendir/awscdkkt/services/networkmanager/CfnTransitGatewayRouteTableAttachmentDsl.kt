@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
