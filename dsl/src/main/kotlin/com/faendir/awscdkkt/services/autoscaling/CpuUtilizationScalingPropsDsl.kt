package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps

@Generated
public fun cpuUtilizationScalingProps(initializer: CpuUtilizationScalingProps.Builder.() -> Unit =
    {}): CpuUtilizationScalingProps =
    CpuUtilizationScalingProps.builder().apply(initializer).build()
