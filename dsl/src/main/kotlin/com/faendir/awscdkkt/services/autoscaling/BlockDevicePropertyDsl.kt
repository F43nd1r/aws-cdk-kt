package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

@Generated
public
    fun blockDeviceProperty(initializer: CfnLaunchConfiguration.BlockDeviceProperty.Builder.() -> Unit
    = {}): CfnLaunchConfiguration.BlockDeviceProperty =
    CfnLaunchConfiguration.BlockDeviceProperty.builder().apply(initializer).build()
