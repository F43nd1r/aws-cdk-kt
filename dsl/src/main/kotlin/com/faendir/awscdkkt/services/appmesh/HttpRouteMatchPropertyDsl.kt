@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

public fun httpRouteMatchProperty(initializer: CfnRoute.HttpRouteMatchProperty.Builder.() -> Unit):
    CfnRoute.HttpRouteMatchProperty =
    CfnRoute.HttpRouteMatchProperty.builder().apply(initializer).build()
