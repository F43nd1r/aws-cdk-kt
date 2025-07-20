package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcAttachment(
  id: String,
  props: CfnVpcAttachmentProps,
  initializer: @AwsCdkDsl CfnVpcAttachment.() -> Unit = {},
): CfnVpcAttachment = CfnVpcAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVpcAttachment(id: String, initializer: @AwsCdkDsl CfnVpcAttachment.Builder.() -> Unit = {}): CfnVpcAttachment = CfnVpcAttachment.Builder.create(this, id).apply(initializer).build()
