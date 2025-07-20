package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnConnectAttachment.() -> Unit = {},
): CfnConnectAttachment = CfnConnectAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnectAttachment(id: String, initializer: @AwsCdkDsl CfnConnectAttachment.Builder.() -> Unit = {}): CfnConnectAttachment = CfnConnectAttachment.Builder.create(this, id).apply(initializer).build()
