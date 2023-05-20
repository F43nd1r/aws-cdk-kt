@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

public
    fun networkInterfaceProperty(initializer: CfnLaunchTemplate.NetworkInterfaceProperty.Builder.() -> Unit):
    CfnLaunchTemplate.NetworkInterfaceProperty =
    CfnLaunchTemplate.NetworkInterfaceProperty.builder().apply(initializer).build()
