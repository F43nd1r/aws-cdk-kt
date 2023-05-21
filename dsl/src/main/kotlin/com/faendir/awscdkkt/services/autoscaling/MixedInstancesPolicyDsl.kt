package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy

@Generated
public fun mixedInstancesPolicy(initializer: MixedInstancesPolicy.Builder.() -> Unit = {}):
    MixedInstancesPolicy = MixedInstancesPolicy.builder().apply(initializer).build()
