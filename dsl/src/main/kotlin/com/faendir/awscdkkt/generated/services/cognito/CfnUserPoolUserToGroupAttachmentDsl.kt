package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolUserToGroupAttachment(
  id: String,
  props: CfnUserPoolUserToGroupAttachmentProps,
  initializer: @AwsCdkDsl CfnUserPoolUserToGroupAttachment.() -> Unit = {},
): CfnUserPoolUserToGroupAttachment = CfnUserPoolUserToGroupAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolUserToGroupAttachment(id: String, initializer: @AwsCdkDsl CfnUserPoolUserToGroupAttachment.Builder.() -> Unit = {}): CfnUserPoolUserToGroupAttachment = CfnUserPoolUserToGroupAttachment.Builder.create(this, id).apply(initializer).build()
