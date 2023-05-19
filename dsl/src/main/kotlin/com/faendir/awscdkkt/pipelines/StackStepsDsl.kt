@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.StackSteps

public fun stackSteps(initializer: StackSteps.Builder.() -> Unit): StackSteps =
    StackSteps.builder().apply(initializer).build()
