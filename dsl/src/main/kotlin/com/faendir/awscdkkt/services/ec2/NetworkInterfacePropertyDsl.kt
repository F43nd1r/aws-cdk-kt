package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun networkInterfaceProperty(initializer: CfnLaunchTemplate.NetworkInterfaceProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.NetworkInterfaceProperty =
    CfnLaunchTemplate.NetworkInterfaceProperty.builder().apply(initializer).build()
