@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpRouteMatch

public fun httpRouteMatch(initializer: HttpRouteMatch.Builder.() -> Unit): HttpRouteMatch =
    HttpRouteMatch.builder().apply(initializer).build()
