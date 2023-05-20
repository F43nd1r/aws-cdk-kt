@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CapacityConfig

public fun capacityConfig(initializer: CapacityConfig.Builder.() -> Unit): CapacityConfig =
    CapacityConfig.builder().apply(initializer).build()
