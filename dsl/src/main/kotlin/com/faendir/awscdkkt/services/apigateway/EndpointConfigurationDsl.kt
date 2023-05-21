package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.EndpointConfiguration

@Generated
public fun endpointConfiguration(initializer: EndpointConfiguration.Builder.() -> Unit = {}):
    EndpointConfiguration = EndpointConfiguration.builder().apply(initializer).build()
