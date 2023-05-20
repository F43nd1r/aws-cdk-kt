@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps
import software.constructs.Construct

public fun Construct.cfnPolicyPrincipalAttachment(
  id: String,
  props: CfnPolicyPrincipalAttachmentProps,
  initializer: CfnPolicyPrincipalAttachment.() -> Unit = {},
): CfnPolicyPrincipalAttachment = CfnPolicyPrincipalAttachment(this, id, props).apply(initializer)
