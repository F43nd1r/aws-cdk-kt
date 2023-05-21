package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.Http2ConnectionPool

@Generated
public fun http2ConnectionPool(initializer: Http2ConnectionPool.Builder.() -> Unit = {}):
    Http2ConnectionPool = Http2ConnectionPool.builder().apply(initializer).build()
