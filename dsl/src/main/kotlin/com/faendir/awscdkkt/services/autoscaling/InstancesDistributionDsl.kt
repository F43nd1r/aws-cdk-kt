@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.InstancesDistribution

public fun instancesDistribution(initializer: InstancesDistribution.Builder.() -> Unit):
    InstancesDistribution = InstancesDistribution.builder().apply(initializer).build()
