@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.elasticsearch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions is deprecated in CDK.")
@Generated
public fun buildCustomEndpointOptions(initializer: @AwsCdkDsl
    CustomEndpointOptions.Builder.() -> Unit = {}): CustomEndpointOptions =
    CustomEndpointOptions.Builder().apply(initializer).build()
