package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions

@Generated
public fun httpGatewayListenerOptions(initializer: HttpGatewayListenerOptions.Builder.() -> Unit =
    {}): HttpGatewayListenerOptions =
    HttpGatewayListenerOptions.builder().apply(initializer).build()
