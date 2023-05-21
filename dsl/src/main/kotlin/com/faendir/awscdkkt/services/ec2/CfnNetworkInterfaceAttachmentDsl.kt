package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkInterfaceAttachment(
  id: String,
  props: CfnNetworkInterfaceAttachmentProps,
  initializer: CfnNetworkInterfaceAttachment.() -> Unit = {},
): CfnNetworkInterfaceAttachment = CfnNetworkInterfaceAttachment(this, id, props).apply(initializer)
