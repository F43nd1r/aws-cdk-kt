package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions

@Generated
public fun buildTcpHealthCheckOptions(initializer: @AwsCdkDsl
    TcpHealthCheckOptions.Builder.() -> Unit = {}): TcpHealthCheckOptions =
    TcpHealthCheckOptions.Builder().apply(initializer).build()
