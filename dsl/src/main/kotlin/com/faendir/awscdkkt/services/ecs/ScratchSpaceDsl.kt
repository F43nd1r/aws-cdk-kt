@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ScratchSpace

public fun scratchSpace(initializer: ScratchSpace.Builder.() -> Unit): ScratchSpace =
    ScratchSpace.builder().apply(initializer).build()
