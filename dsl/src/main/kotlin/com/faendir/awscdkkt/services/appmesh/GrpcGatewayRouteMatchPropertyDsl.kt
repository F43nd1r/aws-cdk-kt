@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

public
    fun grpcGatewayRouteMatchProperty(initializer: CfnGatewayRoute.GrpcGatewayRouteMatchProperty.Builder.() -> Unit):
    CfnGatewayRoute.GrpcGatewayRouteMatchProperty =
    CfnGatewayRoute.GrpcGatewayRouteMatchProperty.builder().apply(initializer).build()
