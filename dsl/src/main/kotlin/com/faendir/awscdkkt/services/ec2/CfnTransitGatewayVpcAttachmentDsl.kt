@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayVpcAttachment(
  id: String,
  props: CfnTransitGatewayVpcAttachmentProps,
  initializer: CfnTransitGatewayVpcAttachment.() -> Unit = {},
): CfnTransitGatewayVpcAttachment = CfnTransitGatewayVpcAttachment(this, id,
    props).apply(initializer)
