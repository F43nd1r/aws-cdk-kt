@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

public
    fun httpRouteActionProperty(initializer: CfnRoute.HttpRouteActionProperty.Builder.() -> Unit):
    CfnRoute.HttpRouteActionProperty =
    CfnRoute.HttpRouteActionProperty.builder().apply(initializer).build()
