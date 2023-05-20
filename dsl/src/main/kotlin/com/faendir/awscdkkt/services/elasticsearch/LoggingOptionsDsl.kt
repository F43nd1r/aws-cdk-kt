@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.LoggingOptions

public fun loggingOptions(initializer: LoggingOptions.Builder.() -> Unit): LoggingOptions =
    LoggingOptions.builder().apply(initializer).build()
