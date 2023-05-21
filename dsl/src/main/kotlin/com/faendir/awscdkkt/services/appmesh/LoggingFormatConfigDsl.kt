package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.LoggingFormatConfig

@Generated
public fun loggingFormatConfig(initializer: LoggingFormatConfig.Builder.() -> Unit = {}):
    LoggingFormatConfig = LoggingFormatConfig.builder().apply(initializer).build()
