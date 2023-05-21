package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps

@Generated
public
    fun networkUtilizationScalingProps(initializer: NetworkUtilizationScalingProps.Builder.() -> Unit
    = {}): NetworkUtilizationScalingProps =
    NetworkUtilizationScalingProps.builder().apply(initializer).build()
