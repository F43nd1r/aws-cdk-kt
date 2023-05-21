package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.LoggingOptions

@Generated
public fun loggingOptions(initializer: LoggingOptions.Builder.() -> Unit = {}): LoggingOptions =
    LoggingOptions.builder().apply(initializer).build()
