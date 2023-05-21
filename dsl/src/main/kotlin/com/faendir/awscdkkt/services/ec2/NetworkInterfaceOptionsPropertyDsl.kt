package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint

@Generated
public
    fun networkInterfaceOptionsProperty(initializer: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Builder.() -> Unit
    = {}): CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty =
    CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.builder().apply(initializer).build()
