package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEndpoint

@Generated
public
    fun endpointEventBusProperty(initializer: CfnEndpoint.EndpointEventBusProperty.Builder.() -> Unit
    = {}): CfnEndpoint.EndpointEventBusProperty =
    CfnEndpoint.EndpointEventBusProperty.builder().apply(initializer).build()
