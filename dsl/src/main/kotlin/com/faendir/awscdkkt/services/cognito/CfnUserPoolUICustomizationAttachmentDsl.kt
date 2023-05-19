@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
