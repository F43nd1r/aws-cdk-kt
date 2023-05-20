@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.InstancesDistribution

public fun instancesDistribution(initializer: InstancesDistribution.Builder.() -> Unit):
    InstancesDistribution = InstancesDistribution.builder().apply(initializer).build()
