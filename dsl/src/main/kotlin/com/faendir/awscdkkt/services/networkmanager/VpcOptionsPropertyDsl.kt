package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment

@Generated
public fun vpcOptionsProperty(initializer: CfnVpcAttachment.VpcOptionsProperty.Builder.() -> Unit =
    {}): CfnVpcAttachment.VpcOptionsProperty =
    CfnVpcAttachment.VpcOptionsProperty.builder().apply(initializer).build()
