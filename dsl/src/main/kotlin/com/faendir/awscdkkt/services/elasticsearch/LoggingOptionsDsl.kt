@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.LoggingOptions

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.LoggingOptions is deprecated in CDK.")
@Generated
public fun loggingOptions(initializer: LoggingOptions.Builder.() -> Unit = {}): LoggingOptions =
    LoggingOptions.builder().apply(initializer).build()
