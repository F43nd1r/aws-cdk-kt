package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CapacityConfig

@Generated
public fun capacityConfig(initializer: CapacityConfig.Builder.() -> Unit = {}): CapacityConfig =
    CapacityConfig.builder().apply(initializer).build()
