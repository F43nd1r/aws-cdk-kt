package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.AccessLogDestinationConfig

@Generated
public fun accessLogDestinationConfig(initializer: AccessLogDestinationConfig.Builder.() -> Unit =
    {}): AccessLogDestinationConfig =
    AccessLogDestinationConfig.builder().apply(initializer).build()
