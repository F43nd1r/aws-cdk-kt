package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun httpRouteActionProperty(initializer: CfnRoute.HttpRouteActionProperty.Builder.() -> Unit
    = {}): CfnRoute.HttpRouteActionProperty =
    CfnRoute.HttpRouteActionProperty.builder().apply(initializer).build()
