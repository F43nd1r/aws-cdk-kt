@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVolumeAttachment
import software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps
import software.constructs.Construct

public fun Construct.cfnVolumeAttachment(
  id: String,
  props: CfnVolumeAttachmentProps,
  initializer: CfnVolumeAttachment.() -> Unit = {},
): CfnVolumeAttachment = CfnVolumeAttachment(this, id, props).apply(initializer)
