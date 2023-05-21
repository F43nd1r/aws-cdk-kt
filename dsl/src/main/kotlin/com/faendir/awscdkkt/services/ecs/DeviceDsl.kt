package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Device

@Generated
public fun device(initializer: Device.Builder.() -> Unit = {}): Device =
    Device.builder().apply(initializer).build()
