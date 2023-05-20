@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps
import software.constructs.Construct

public fun Construct.cfnUserPoolUICustomizationAttachment(
  id: String,
  props: CfnUserPoolUICustomizationAttachmentProps,
  initializer: CfnUserPoolUICustomizationAttachment.() -> Unit = {},
): CfnUserPoolUICustomizationAttachment = CfnUserPoolUICustomizationAttachment(this, id,
    props).apply(initializer)
