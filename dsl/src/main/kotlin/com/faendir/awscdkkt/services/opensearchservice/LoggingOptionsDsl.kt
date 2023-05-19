@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.LoggingOptions

public fun loggingOptions(initializer: LoggingOptions.Builder.() -> Unit): LoggingOptions =
    LoggingOptions.builder().apply(initializer).build()
