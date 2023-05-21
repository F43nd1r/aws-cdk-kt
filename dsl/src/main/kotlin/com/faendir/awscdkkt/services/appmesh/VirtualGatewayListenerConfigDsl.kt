package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig

@Generated
public fun virtualGatewayListenerConfig(initializer: VirtualGatewayListenerConfig.Builder.() -> Unit
    = {}): VirtualGatewayListenerConfig =
    VirtualGatewayListenerConfig.builder().apply(initializer).build()
