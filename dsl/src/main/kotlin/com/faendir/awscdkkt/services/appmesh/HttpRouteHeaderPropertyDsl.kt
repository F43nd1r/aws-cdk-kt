package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun httpRouteHeaderProperty(initializer: CfnRoute.HttpRouteHeaderProperty.Builder.() -> Unit
    = {}): CfnRoute.HttpRouteHeaderProperty =
    CfnRoute.HttpRouteHeaderProperty.builder().apply(initializer).build()
