package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun privateIpAddProperty(initializer: CfnLaunchTemplate.PrivateIpAddProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.PrivateIpAddProperty =
    CfnLaunchTemplate.PrivateIpAddProperty.builder().apply(initializer).build()
