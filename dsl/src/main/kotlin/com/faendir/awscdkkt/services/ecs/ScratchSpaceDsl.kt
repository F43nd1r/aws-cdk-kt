package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ScratchSpace

@Generated
public fun scratchSpace(initializer: ScratchSpace.Builder.() -> Unit = {}): ScratchSpace =
    ScratchSpace.builder().apply(initializer).build()
