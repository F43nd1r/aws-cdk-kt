package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpConnectionPool

@Generated
public fun httpConnectionPool(initializer: HttpConnectionPool.Builder.() -> Unit = {}):
    HttpConnectionPool = HttpConnectionPool.builder().apply(initializer).build()
