package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy

@Generated
public fun capacityProviderStrategy(initializer: CapacityProviderStrategy.Builder.() -> Unit = {}):
    CapacityProviderStrategy = CapacityProviderStrategy.builder().apply(initializer).build()
