@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps
import software.constructs.Construct

public fun Construct.cfnVpcAttachment(
  id: String,
  props: CfnVpcAttachmentProps,
  initializer: CfnVpcAttachment.() -> Unit = {},
): CfnVpcAttachment = CfnVpcAttachment(this, id, props).apply(initializer)
