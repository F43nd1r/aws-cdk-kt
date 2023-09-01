package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun buildTcpRouteProperty(initializer: @AwsCdkDsl
    CfnRoute.TcpRouteProperty.Builder.() -> Unit = {}): CfnRoute.TcpRouteProperty =
    CfnRoute.TcpRouteProperty.Builder().apply(initializer).build()
