@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

public
    fun gatewayRouteTargetProperty(initializer: CfnGatewayRoute.GatewayRouteTargetProperty.Builder.() -> Unit):
    CfnGatewayRoute.GatewayRouteTargetProperty =
    CfnGatewayRoute.GatewayRouteTargetProperty.builder().apply(initializer).build()
