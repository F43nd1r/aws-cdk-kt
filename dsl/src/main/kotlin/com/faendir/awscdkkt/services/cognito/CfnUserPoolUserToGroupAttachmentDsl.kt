@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps
import software.constructs.Construct

public fun Construct.cfnUserPoolUserToGroupAttachment(
  id: String,
  props: CfnUserPoolUserToGroupAttachmentProps,
  initializer: CfnUserPoolUserToGroupAttachment.() -> Unit = {},
): CfnUserPoolUserToGroupAttachment = CfnUserPoolUserToGroupAttachment(this, id,
    props).apply(initializer)
