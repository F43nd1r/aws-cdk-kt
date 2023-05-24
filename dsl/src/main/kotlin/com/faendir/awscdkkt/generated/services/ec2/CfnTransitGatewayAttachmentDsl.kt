package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayAttachment(id: String,
    props: CfnTransitGatewayAttachmentProps): CfnTransitGatewayAttachment =
    CfnTransitGatewayAttachment(this, id, props)

@Generated
public fun Construct.cfnTransitGatewayAttachment(
  id: String,
  props: CfnTransitGatewayAttachmentProps,
  initializer: @AwsCdkDsl CfnTransitGatewayAttachment.() -> Unit,
): CfnTransitGatewayAttachment = CfnTransitGatewayAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayAttachment(id: String, initializer: @AwsCdkDsl
    CfnTransitGatewayAttachment.Builder.() -> Unit): CfnTransitGatewayAttachment =
    CfnTransitGatewayAttachment.Builder.create(this, id).apply(initializer).build()
