package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun httpGatewayRoutePathRewriteProperty(initializer: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty =
    CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.builder().apply(initializer).build()
