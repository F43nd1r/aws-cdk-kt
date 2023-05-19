@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions

public fun customEndpointOptions(initializer: CustomEndpointOptions.Builder.() -> Unit):
    CustomEndpointOptions = CustomEndpointOptions.builder().apply(initializer).build()
