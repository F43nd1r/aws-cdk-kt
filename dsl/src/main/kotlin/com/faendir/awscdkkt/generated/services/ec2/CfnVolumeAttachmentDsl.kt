package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVolumeAttachment
import software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVolumeAttachment(id: String, props: CfnVolumeAttachmentProps):
    CfnVolumeAttachment = CfnVolumeAttachment(this, id, props)

@Generated
public fun Construct.cfnVolumeAttachment(
  id: String,
  props: CfnVolumeAttachmentProps,
  initializer: @AwsCdkDsl CfnVolumeAttachment.() -> Unit,
): CfnVolumeAttachment = CfnVolumeAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVolumeAttachment(id: String, initializer: @AwsCdkDsl
    CfnVolumeAttachment.Builder.() -> Unit): CfnVolumeAttachment =
    CfnVolumeAttachment.Builder.create(this, id).apply(initializer).build()
