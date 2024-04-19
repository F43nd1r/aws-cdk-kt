package com.faendir.awscdkkt.generated.services.globalaccelerator

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment
import software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCrossAccountAttachment(
  id: String,
  props: CfnCrossAccountAttachmentProps,
  initializer: @AwsCdkDsl CfnCrossAccountAttachment.() -> Unit = {},
): CfnCrossAccountAttachment = CfnCrossAccountAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCrossAccountAttachment(id: String, initializer: @AwsCdkDsl
    CfnCrossAccountAttachment.Builder.() -> Unit = {}): CfnCrossAccountAttachment =
    CfnCrossAccountAttachment.Builder.create(this, id).apply(initializer).build()
