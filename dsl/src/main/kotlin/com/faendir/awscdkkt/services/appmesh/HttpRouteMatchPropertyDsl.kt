package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun httpRouteMatchProperty(initializer: CfnRoute.HttpRouteMatchProperty.Builder.() -> Unit =
    {}): CfnRoute.HttpRouteMatchProperty =
    CfnRoute.HttpRouteMatchProperty.builder().apply(initializer).build()
