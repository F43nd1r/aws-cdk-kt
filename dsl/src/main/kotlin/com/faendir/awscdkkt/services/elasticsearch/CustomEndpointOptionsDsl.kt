@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions is deprecated in CDK.")
@Generated
public fun customEndpointOptions(initializer: CustomEndpointOptions.Builder.() -> Unit = {}):
    CustomEndpointOptions = CustomEndpointOptions.builder().apply(initializer).build()
