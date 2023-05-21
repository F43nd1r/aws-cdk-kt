package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps

@Generated
public fun cpuUtilizationScalingProps(initializer: CpuUtilizationScalingProps.Builder.() -> Unit =
    {}): CpuUtilizationScalingProps =
    CpuUtilizationScalingProps.builder().apply(initializer).build()
