package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayAttachment(
  id: String,
  props: CfnTransitGatewayAttachmentProps,
  initializer: CfnTransitGatewayAttachment.() -> Unit = {},
): CfnTransitGatewayAttachment = CfnTransitGatewayAttachment(this, id, props).apply(initializer)
