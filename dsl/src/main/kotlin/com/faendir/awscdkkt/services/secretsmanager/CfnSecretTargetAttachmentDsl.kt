@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps
import software.constructs.Construct

public fun Construct.cfnSecretTargetAttachment(
  id: String,
  props: CfnSecretTargetAttachmentProps,
  initializer: CfnSecretTargetAttachment.() -> Unit = {},
): CfnSecretTargetAttachment = CfnSecretTargetAttachment(this, id, props).apply(initializer)
