package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions

@Generated
public fun httpRouteSpecOptions(initializer: HttpRouteSpecOptions.Builder.() -> Unit = {}):
    HttpRouteSpecOptions = HttpRouteSpecOptions.builder().apply(initializer).build()
