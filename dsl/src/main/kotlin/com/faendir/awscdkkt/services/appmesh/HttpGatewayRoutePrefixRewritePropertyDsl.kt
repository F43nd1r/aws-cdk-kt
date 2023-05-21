package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@Generated
public
    fun httpGatewayRoutePrefixRewriteProperty(initializer: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Builder.() -> Unit
    = {}): CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty =
    CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.builder().apply(initializer).build()
