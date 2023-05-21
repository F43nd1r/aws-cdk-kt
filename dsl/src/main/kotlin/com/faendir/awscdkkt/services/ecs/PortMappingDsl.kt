package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.PortMapping

@Generated
public fun portMapping(initializer: PortMapping.Builder.() -> Unit = {}): PortMapping =
    PortMapping.builder().apply(initializer).build()
