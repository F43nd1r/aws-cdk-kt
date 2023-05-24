package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

@Generated
public fun buildBlockDeviceProperty(initializer: @AwsCdkDsl
    CfnLaunchConfiguration.BlockDeviceProperty.Builder.() -> Unit):
    CfnLaunchConfiguration.BlockDeviceProperty =
    CfnLaunchConfiguration.BlockDeviceProperty.Builder().apply(initializer).build()
