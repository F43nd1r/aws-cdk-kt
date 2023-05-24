package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayPeeringAttachment(id: String,
    props: CfnTransitGatewayPeeringAttachmentProps): CfnTransitGatewayPeeringAttachment =
    CfnTransitGatewayPeeringAttachment(this, id, props)

@Generated
public fun Construct.cfnTransitGatewayPeeringAttachment(
  id: String,
  props: CfnTransitGatewayPeeringAttachmentProps,
  initializer: @AwsCdkDsl CfnTransitGatewayPeeringAttachment.() -> Unit,
): CfnTransitGatewayPeeringAttachment = CfnTransitGatewayPeeringAttachment(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayPeeringAttachment(id: String, initializer: @AwsCdkDsl
    CfnTransitGatewayPeeringAttachment.Builder.() -> Unit): CfnTransitGatewayPeeringAttachment =
    CfnTransitGatewayPeeringAttachment.Builder.create(this, id).apply(initializer).build()
