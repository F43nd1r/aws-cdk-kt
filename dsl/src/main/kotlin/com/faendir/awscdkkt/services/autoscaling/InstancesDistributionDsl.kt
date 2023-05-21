package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.InstancesDistribution

@Generated
public fun instancesDistribution(initializer: InstancesDistribution.Builder.() -> Unit = {}):
    InstancesDistribution = InstancesDistribution.builder().apply(initializer).build()
