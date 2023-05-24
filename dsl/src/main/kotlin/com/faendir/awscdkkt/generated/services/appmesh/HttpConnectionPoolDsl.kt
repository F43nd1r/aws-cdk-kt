package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpConnectionPool

@Generated
public fun buildHttpConnectionPool(initializer: @AwsCdkDsl HttpConnectionPool.Builder.() -> Unit):
    HttpConnectionPool = HttpConnectionPool.Builder().apply(initializer).build()
