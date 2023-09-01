package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayRouteTableAttachment(
  id: String,
  props: CfnTransitGatewayRouteTableAttachmentProps,
  initializer: @AwsCdkDsl CfnTransitGatewayRouteTableAttachment.() -> Unit = {},
): CfnTransitGatewayRouteTableAttachment = CfnTransitGatewayRouteTableAttachment(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayRouteTableAttachment(id: String, initializer: @AwsCdkDsl
    CfnTransitGatewayRouteTableAttachment.Builder.() -> Unit = {}):
    CfnTransitGatewayRouteTableAttachment =
    CfnTransitGatewayRouteTableAttachment.Builder.create(this, id).apply(initializer).build()
