@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EventSourceMappingOptions

public fun eventSourceMappingOptions(initializer: EventSourceMappingOptions.Builder.() -> Unit):
    EventSourceMappingOptions = EventSourceMappingOptions.builder().apply(initializer).build()
