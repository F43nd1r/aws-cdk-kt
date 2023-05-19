@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps
import software.constructs.Construct

public fun Construct.cfnUserPoolRiskConfigurationAttachment(
  id: String,
  props: CfnUserPoolRiskConfigurationAttachmentProps,
  initializer: CfnUserPoolRiskConfigurationAttachment.() -> Unit = {},
): CfnUserPoolRiskConfigurationAttachment = CfnUserPoolRiskConfigurationAttachment(this, id,
    props).apply(initializer)
