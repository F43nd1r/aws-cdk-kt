@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.elasticsearch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CapacityConfig

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.CapacityConfig is deprecated in CDK.")
@Generated
public fun buildCapacityConfig(initializer: @AwsCdkDsl CapacityConfig.Builder.() -> Unit):
    CapacityConfig = CapacityConfig.Builder().apply(initializer).build()
