@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps
import software.constructs.Construct

public fun Construct.cfnVPCGatewayAttachment(
  id: String,
  props: CfnVPCGatewayAttachmentProps,
  initializer: CfnVPCGatewayAttachment.() -> Unit = {},
): CfnVPCGatewayAttachment = CfnVPCGatewayAttachment(this, id, props).apply(initializer)
