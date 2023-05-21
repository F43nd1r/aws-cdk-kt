package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.RouteSpecConfig

@Generated
public fun routeSpecConfig(initializer: RouteSpecConfig.Builder.() -> Unit = {}): RouteSpecConfig =
    RouteSpecConfig.builder().apply(initializer).build()
