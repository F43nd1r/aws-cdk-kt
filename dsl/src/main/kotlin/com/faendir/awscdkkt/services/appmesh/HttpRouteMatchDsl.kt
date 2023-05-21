package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpRouteMatch

@Generated
public fun httpRouteMatch(initializer: HttpRouteMatch.Builder.() -> Unit = {}): HttpRouteMatch =
    HttpRouteMatch.builder().apply(initializer).build()
