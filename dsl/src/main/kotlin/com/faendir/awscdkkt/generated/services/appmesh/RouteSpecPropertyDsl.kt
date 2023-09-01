package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun buildRouteSpecProperty(initializer: @AwsCdkDsl
    CfnRoute.RouteSpecProperty.Builder.() -> Unit = {}): CfnRoute.RouteSpecProperty =
    CfnRoute.RouteSpecProperty.Builder().apply(initializer).build()
