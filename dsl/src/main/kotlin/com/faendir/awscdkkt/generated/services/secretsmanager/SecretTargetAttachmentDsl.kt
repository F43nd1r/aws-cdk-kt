package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.secretTargetAttachment(
  id: String,
  props: SecretTargetAttachmentProps,
  initializer: @AwsCdkDsl SecretTargetAttachment.() -> Unit = {},
): SecretTargetAttachment = SecretTargetAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSecretTargetAttachment(id: String, initializer: @AwsCdkDsl SecretTargetAttachment.Builder.() -> Unit = {}): SecretTargetAttachment = SecretTargetAttachment.Builder.create(this, id).apply(initializer).build()
