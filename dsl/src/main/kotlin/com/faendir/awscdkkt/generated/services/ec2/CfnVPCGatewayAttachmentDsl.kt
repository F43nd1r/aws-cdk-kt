package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCGatewayAttachment(
  id: String,
  props: CfnVPCGatewayAttachmentProps,
  initializer: @AwsCdkDsl CfnVPCGatewayAttachment.() -> Unit = {},
): CfnVPCGatewayAttachment = CfnVPCGatewayAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCGatewayAttachment(id: String, initializer: @AwsCdkDsl CfnVPCGatewayAttachment.Builder.() -> Unit = {}): CfnVPCGatewayAttachment = CfnVPCGatewayAttachment.Builder.create(this, id).apply(initializer).build()
