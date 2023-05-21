package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolRiskConfigurationAttachment(
  id: String,
  props: CfnUserPoolRiskConfigurationAttachmentProps,
  initializer: CfnUserPoolRiskConfigurationAttachment.() -> Unit = {},
): CfnUserPoolRiskConfigurationAttachment = CfnUserPoolRiskConfigurationAttachment(this, id,
    props).apply(initializer)
