package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.WeightedTarget

@Generated
public fun weightedTarget(initializer: WeightedTarget.Builder.() -> Unit = {}): WeightedTarget =
    WeightedTarget.builder().apply(initializer).build()
