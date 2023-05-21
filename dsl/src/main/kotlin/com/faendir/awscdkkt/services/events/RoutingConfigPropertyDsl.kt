package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEndpoint

@Generated
public fun routingConfigProperty(initializer: CfnEndpoint.RoutingConfigProperty.Builder.() -> Unit =
    {}): CfnEndpoint.RoutingConfigProperty =
    CfnEndpoint.RoutingConfigProperty.builder().apply(initializer).build()
