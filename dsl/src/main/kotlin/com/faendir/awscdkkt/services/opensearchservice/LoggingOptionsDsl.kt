@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.LoggingOptions

public fun loggingOptions(initializer: LoggingOptions.Builder.() -> Unit): LoggingOptions =
    LoggingOptions.builder().apply(initializer).build()
