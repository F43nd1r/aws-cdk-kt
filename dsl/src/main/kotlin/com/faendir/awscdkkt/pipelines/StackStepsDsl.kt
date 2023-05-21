package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.StackSteps

@Generated
public fun stackSteps(initializer: StackSteps.Builder.() -> Unit = {}): StackSteps =
    StackSteps.builder().apply(initializer).build()
