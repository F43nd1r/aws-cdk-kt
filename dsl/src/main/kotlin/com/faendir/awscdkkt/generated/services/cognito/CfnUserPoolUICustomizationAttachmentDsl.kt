package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolUICustomizationAttachment(id: String,
    props: CfnUserPoolUICustomizationAttachmentProps): CfnUserPoolUICustomizationAttachment =
    CfnUserPoolUICustomizationAttachment(this, id, props)

@Generated
public fun Construct.cfnUserPoolUICustomizationAttachment(
  id: String,
  props: CfnUserPoolUICustomizationAttachmentProps,
  initializer: @AwsCdkDsl CfnUserPoolUICustomizationAttachment.() -> Unit,
): CfnUserPoolUICustomizationAttachment = CfnUserPoolUICustomizationAttachment(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolUICustomizationAttachment(id: String, initializer: @AwsCdkDsl
    CfnUserPoolUICustomizationAttachment.Builder.() -> Unit): CfnUserPoolUICustomizationAttachment =
    CfnUserPoolUICustomizationAttachment.Builder.create(this, id).apply(initializer).build()
