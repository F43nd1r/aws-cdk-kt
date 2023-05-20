@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions

public fun customEndpointOptions(initializer: CustomEndpointOptions.Builder.() -> Unit):
    CustomEndpointOptions = CustomEndpointOptions.builder().apply(initializer).build()
