package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecretTargetAttachment(
  id: String,
  props: CfnSecretTargetAttachmentProps,
  initializer: CfnSecretTargetAttachment.() -> Unit = {},
): CfnSecretTargetAttachment = CfnSecretTargetAttachment(this, id, props).apply(initializer)
