@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

public
    fun httpRouteHeaderProperty(initializer: CfnRoute.HttpRouteHeaderProperty.Builder.() -> Unit):
    CfnRoute.HttpRouteHeaderProperty =
    CfnRoute.HttpRouteHeaderProperty.builder().apply(initializer).build()
