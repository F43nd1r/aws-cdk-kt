@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy

public fun mixedInstancesPolicy(initializer: MixedInstancesPolicy.Builder.() -> Unit):
    MixedInstancesPolicy = MixedInstancesPolicy.builder().apply(initializer).build()
