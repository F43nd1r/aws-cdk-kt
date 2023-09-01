@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.elasticsearch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig is deprecated in CDK.")
@Generated
public fun buildZoneAwarenessConfig(initializer: @AwsCdkDsl ZoneAwarenessConfig.Builder.() -> Unit =
    {}): ZoneAwarenessConfig = ZoneAwarenessConfig.Builder().apply(initializer).build()
