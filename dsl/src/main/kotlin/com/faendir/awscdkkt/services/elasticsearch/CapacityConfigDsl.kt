@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CapacityConfig

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.CapacityConfig is deprecated in CDK.")
@Generated
public fun capacityConfig(initializer: CapacityConfig.Builder.() -> Unit = {}): CapacityConfig =
    CapacityConfig.builder().apply(initializer).build()
