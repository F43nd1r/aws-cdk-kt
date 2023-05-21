package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.RouteAttributes

@Generated
public fun routeAttributes(initializer: RouteAttributes.Builder.() -> Unit = {}): RouteAttributes =
    RouteAttributes.builder().apply(initializer).build()
