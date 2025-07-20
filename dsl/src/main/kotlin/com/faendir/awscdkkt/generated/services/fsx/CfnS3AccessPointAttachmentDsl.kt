package com.faendir.awscdkkt.generated.services.fsx

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachment
import software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnS3AccessPointAttachment(
  id: String,
  props: CfnS3AccessPointAttachmentProps,
  initializer: @AwsCdkDsl CfnS3AccessPointAttachment.() -> Unit = {},
): CfnS3AccessPointAttachment = CfnS3AccessPointAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnS3AccessPointAttachment(id: String, initializer: @AwsCdkDsl CfnS3AccessPointAttachment.Builder.() -> Unit = {}): CfnS3AccessPointAttachment = CfnS3AccessPointAttachment.Builder.create(this, id).apply(initializer).build()
