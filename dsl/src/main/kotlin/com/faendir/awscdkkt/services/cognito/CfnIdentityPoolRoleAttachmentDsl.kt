@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps
import software.constructs.Construct

public fun Construct.cfnIdentityPoolRoleAttachment(
  id: String,
  props: CfnIdentityPoolRoleAttachmentProps,
  initializer: CfnIdentityPoolRoleAttachment.() -> Unit = {},
): CfnIdentityPoolRoleAttachment = CfnIdentityPoolRoleAttachment(this, id, props).apply(initializer)
