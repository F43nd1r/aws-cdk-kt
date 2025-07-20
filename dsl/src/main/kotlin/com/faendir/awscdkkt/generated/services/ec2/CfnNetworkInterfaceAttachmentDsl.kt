package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnNetworkInterfaceAttachment.() -> Unit = {},
): CfnNetworkInterfaceAttachment = CfnNetworkInterfaceAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkInterfaceAttachment(id: String, initializer: @AwsCdkDsl CfnNetworkInterfaceAttachment.Builder.() -> Unit = {}): CfnNetworkInterfaceAttachment = CfnNetworkInterfaceAttachment.Builder.create(this, id).apply(initializer).build()
