package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnSecretTargetAttachment.() -> Unit = {},
): CfnSecretTargetAttachment = CfnSecretTargetAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecretTargetAttachment(id: String, initializer: @AwsCdkDsl CfnSecretTargetAttachment.Builder.() -> Unit = {}): CfnSecretTargetAttachment = CfnSecretTargetAttachment.Builder.create(this, id).apply(initializer).build()
