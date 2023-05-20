@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.LoggingOptions

public fun loggingOptions(initializer: LoggingOptions.Builder.() -> Unit): LoggingOptions =
    LoggingOptions.builder().apply(initializer).build()
