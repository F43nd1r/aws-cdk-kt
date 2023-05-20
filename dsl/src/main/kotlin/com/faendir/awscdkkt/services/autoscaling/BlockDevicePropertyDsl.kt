@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

public
    fun blockDeviceProperty(initializer: CfnLaunchConfiguration.BlockDeviceProperty.Builder.() -> Unit):
    CfnLaunchConfiguration.BlockDeviceProperty =
    CfnLaunchConfiguration.BlockDeviceProperty.builder().apply(initializer).build()
