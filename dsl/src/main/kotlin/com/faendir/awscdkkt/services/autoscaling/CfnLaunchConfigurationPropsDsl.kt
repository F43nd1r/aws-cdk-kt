package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps

@Generated
public fun cfnLaunchConfigurationProps(initializer: CfnLaunchConfigurationProps.Builder.() -> Unit =
    {}): CfnLaunchConfigurationProps =
    CfnLaunchConfigurationProps.builder().apply(initializer).build()
