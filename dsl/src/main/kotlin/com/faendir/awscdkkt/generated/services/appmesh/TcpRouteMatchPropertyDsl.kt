package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun buildTcpRouteMatchProperty(initializer: @AwsCdkDsl
    CfnRoute.TcpRouteMatchProperty.Builder.() -> Unit): CfnRoute.TcpRouteMatchProperty =
    CfnRoute.TcpRouteMatchProperty.Builder().apply(initializer).build()
