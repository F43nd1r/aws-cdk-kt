package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TcpConnectionPool

@Generated
public fun buildTcpConnectionPool(initializer: @AwsCdkDsl TcpConnectionPool.Builder.() -> Unit =
    {}): TcpConnectionPool = TcpConnectionPool.Builder().apply(initializer).build()
