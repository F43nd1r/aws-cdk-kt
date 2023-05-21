package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions

@Generated
public
    fun http2VirtualNodeListenerOptions(initializer: Http2VirtualNodeListenerOptions.Builder.() -> Unit
    = {}): Http2VirtualNodeListenerOptions =
    Http2VirtualNodeListenerOptions.builder().apply(initializer).build()
