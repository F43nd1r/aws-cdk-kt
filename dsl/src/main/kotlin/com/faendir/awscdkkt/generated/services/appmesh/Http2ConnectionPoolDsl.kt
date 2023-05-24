package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.Http2ConnectionPool

@Generated
public fun buildHttp2ConnectionPool(initializer: @AwsCdkDsl Http2ConnectionPool.Builder.() -> Unit):
    Http2ConnectionPool = Http2ConnectionPool.Builder().apply(initializer).build()
