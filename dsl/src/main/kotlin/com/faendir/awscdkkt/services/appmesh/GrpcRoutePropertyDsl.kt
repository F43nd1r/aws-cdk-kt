package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun grpcRouteProperty(initializer: CfnRoute.GrpcRouteProperty.Builder.() -> Unit = {}):
    CfnRoute.GrpcRouteProperty = CfnRoute.GrpcRouteProperty.builder().apply(initializer).build()
