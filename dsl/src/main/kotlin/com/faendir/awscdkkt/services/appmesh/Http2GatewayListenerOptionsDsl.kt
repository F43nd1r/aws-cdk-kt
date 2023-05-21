package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions

@Generated
public fun http2GatewayListenerOptions(initializer: Http2GatewayListenerOptions.Builder.() -> Unit =
    {}): Http2GatewayListenerOptions =
    Http2GatewayListenerOptions.builder().apply(initializer).build()
