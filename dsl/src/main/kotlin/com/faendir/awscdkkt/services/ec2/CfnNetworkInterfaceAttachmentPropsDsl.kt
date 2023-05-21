package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps

@Generated
public
    fun cfnNetworkInterfaceAttachmentProps(initializer: CfnNetworkInterfaceAttachmentProps.Builder.() -> Unit
    = {}): CfnNetworkInterfaceAttachmentProps =
    CfnNetworkInterfaceAttachmentProps.builder().apply(initializer).build()
