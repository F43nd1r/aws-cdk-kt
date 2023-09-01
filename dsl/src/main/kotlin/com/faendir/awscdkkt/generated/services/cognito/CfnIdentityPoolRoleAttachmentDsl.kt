package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdentityPoolRoleAttachment(
  id: String,
  props: CfnIdentityPoolRoleAttachmentProps,
  initializer: @AwsCdkDsl CfnIdentityPoolRoleAttachment.() -> Unit = {},
): CfnIdentityPoolRoleAttachment = CfnIdentityPoolRoleAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdentityPoolRoleAttachment(id: String, initializer: @AwsCdkDsl
    CfnIdentityPoolRoleAttachment.Builder.() -> Unit = {}): CfnIdentityPoolRoleAttachment =
    CfnIdentityPoolRoleAttachment.Builder.create(this, id).apply(initializer).build()
