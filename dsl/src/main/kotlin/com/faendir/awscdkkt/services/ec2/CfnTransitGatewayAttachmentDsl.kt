@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayAttachment(
  id: String,
  props: CfnTransitGatewayAttachmentProps,
  initializer: CfnTransitGatewayAttachment.() -> Unit = {},
): CfnTransitGatewayAttachment = CfnTransitGatewayAttachment(this, id, props).apply(initializer)
