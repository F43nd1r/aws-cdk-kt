package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TcpTimeout

@Generated
public fun buildTcpTimeout(initializer: @AwsCdkDsl TcpTimeout.Builder.() -> Unit = {}): TcpTimeout =
    TcpTimeout.Builder().apply(initializer).build()
