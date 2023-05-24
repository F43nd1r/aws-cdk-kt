package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolRiskConfigurationAttachment(id: String,
    props: CfnUserPoolRiskConfigurationAttachmentProps): CfnUserPoolRiskConfigurationAttachment =
    CfnUserPoolRiskConfigurationAttachment(this, id, props)

@Generated
public fun Construct.cfnUserPoolRiskConfigurationAttachment(
  id: String,
  props: CfnUserPoolRiskConfigurationAttachmentProps,
  initializer: @AwsCdkDsl CfnUserPoolRiskConfigurationAttachment.() -> Unit,
): CfnUserPoolRiskConfigurationAttachment = CfnUserPoolRiskConfigurationAttachment(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolRiskConfigurationAttachment(id: String, initializer: @AwsCdkDsl
    CfnUserPoolRiskConfigurationAttachment.Builder.() -> Unit):
    CfnUserPoolRiskConfigurationAttachment =
    CfnUserPoolRiskConfigurationAttachment.Builder.create(this, id).apply(initializer).build()
