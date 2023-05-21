@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig is deprecated in CDK.")
@Generated
public fun zoneAwarenessConfig(initializer: ZoneAwarenessConfig.Builder.() -> Unit = {}):
    ZoneAwarenessConfig = ZoneAwarenessConfig.builder().apply(initializer).build()
