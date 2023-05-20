@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

public
    fun blockDeviceProperty(initializer: CfnLaunchConfiguration.BlockDeviceProperty.Builder.() -> Unit):
    CfnLaunchConfiguration.BlockDeviceProperty =
    CfnLaunchConfiguration.BlockDeviceProperty.builder().apply(initializer).build()
