@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayPeeringAttachment(
  id: String,
  props: CfnTransitGatewayPeeringAttachmentProps,
  initializer: CfnTransitGatewayPeeringAttachment.() -> Unit = {},
): CfnTransitGatewayPeeringAttachment = CfnTransitGatewayPeeringAttachment(this, id,
    props).apply(initializer)
