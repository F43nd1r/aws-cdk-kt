package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch

@Generated
public fun buildHttpGatewayRouteMatch(initializer: @AwsCdkDsl
    HttpGatewayRouteMatch.Builder.() -> Unit = {}): HttpGatewayRouteMatch =
    HttpGatewayRouteMatch.Builder().apply(initializer).build()
