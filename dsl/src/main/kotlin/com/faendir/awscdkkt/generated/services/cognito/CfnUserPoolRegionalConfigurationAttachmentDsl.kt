package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolRegionalConfigurationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolRegionalConfigurationAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolRegionalConfigurationAttachment(
  id: String,
  props: CfnUserPoolRegionalConfigurationAttachmentProps,
  initializer: @AwsCdkDsl CfnUserPoolRegionalConfigurationAttachment.() -> Unit = {},
): CfnUserPoolRegionalConfigurationAttachment = CfnUserPoolRegionalConfigurationAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolRegionalConfigurationAttachment(id: String, initializer: @AwsCdkDsl CfnUserPoolRegionalConfigurationAttachment.Builder.() -> Unit = {}): CfnUserPoolRegionalConfigurationAttachment = CfnUserPoolRegionalConfigurationAttachment.Builder.create(this, id).apply(initializer).build()
