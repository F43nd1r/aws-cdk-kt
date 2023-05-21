package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachment
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectAttachment(
  id: String,
  props: CfnConnectAttachmentProps,
  initializer: CfnConnectAttachment.() -> Unit = {},
): CfnConnectAttachment = CfnConnectAttachment(this, id, props).apply(initializer)
