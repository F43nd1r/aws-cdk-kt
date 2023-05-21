package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes

@Generated
public fun virtualGatewayAttributes(initializer: VirtualGatewayAttributes.Builder.() -> Unit = {}):
    VirtualGatewayAttributes = VirtualGatewayAttributes.builder().apply(initializer).build()
