package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolUICustomizationAttachment(
  id: String,
  props: CfnUserPoolUICustomizationAttachmentProps,
  initializer: CfnUserPoolUICustomizationAttachment.() -> Unit = {},
): CfnUserPoolUICustomizationAttachment = CfnUserPoolUICustomizationAttachment(this, id,
    props).apply(initializer)
