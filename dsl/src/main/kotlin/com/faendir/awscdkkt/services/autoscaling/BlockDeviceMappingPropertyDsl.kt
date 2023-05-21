package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

@Generated
public
    fun blockDeviceMappingProperty(initializer: CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder.() -> Unit
    = {}): CfnLaunchConfiguration.BlockDeviceMappingProperty =
    CfnLaunchConfiguration.BlockDeviceMappingProperty.builder().apply(initializer).build()
