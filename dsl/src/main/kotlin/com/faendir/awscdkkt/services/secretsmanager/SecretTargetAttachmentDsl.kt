@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps
import software.constructs.Construct

public fun Construct.secretTargetAttachment(
  id: String,
  props: SecretTargetAttachmentProps,
  initializer: SecretTargetAttachment.() -> Unit = {},
): SecretTargetAttachment = SecretTargetAttachment(this, id, props).apply(initializer)
