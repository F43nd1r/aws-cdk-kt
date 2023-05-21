package com.faendir.awscdkkt.services.cognito

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
  initializer: CfnUserPoolUserToGroupAttachment.() -> Unit = {},
): CfnUserPoolUserToGroupAttachment = CfnUserPoolUserToGroupAttachment(this, id,
    props).apply(initializer)
