package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment
import software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDirectConnectGatewayAttachment(
  id: String,
  props: CfnDirectConnectGatewayAttachmentProps,
  initializer: @AwsCdkDsl CfnDirectConnectGatewayAttachment.() -> Unit = {},
): CfnDirectConnectGatewayAttachment = CfnDirectConnectGatewayAttachment(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnDirectConnectGatewayAttachment(id: String, initializer: @AwsCdkDsl
    CfnDirectConnectGatewayAttachment.Builder.() -> Unit = {}): CfnDirectConnectGatewayAttachment =
    CfnDirectConnectGatewayAttachment.Builder.create(this, id).apply(initializer).build()
