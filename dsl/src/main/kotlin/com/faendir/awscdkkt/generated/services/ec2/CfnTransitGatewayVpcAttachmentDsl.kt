package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayVpcAttachment(
  id: String,
  props: CfnTransitGatewayVpcAttachmentProps,
  initializer: @AwsCdkDsl CfnTransitGatewayVpcAttachment.() -> Unit = {},
): CfnTransitGatewayVpcAttachment = CfnTransitGatewayVpcAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayVpcAttachment(id: String, initializer: @AwsCdkDsl CfnTransitGatewayVpcAttachment.Builder.() -> Unit = {}): CfnTransitGatewayVpcAttachment = CfnTransitGatewayVpcAttachment.Builder.create(this, id).apply(initializer).build()
