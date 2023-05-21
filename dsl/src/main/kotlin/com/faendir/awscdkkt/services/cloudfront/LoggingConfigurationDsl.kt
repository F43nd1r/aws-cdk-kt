package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.LoggingConfiguration

@Generated
public fun loggingConfiguration(initializer: LoggingConfiguration.Builder.() -> Unit = {}):
    LoggingConfiguration = LoggingConfiguration.builder().apply(initializer).build()
