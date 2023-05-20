@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
