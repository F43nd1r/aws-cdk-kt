package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides

@Generated
public
    fun routeOverridesProperty(initializer: CfnApiGatewayManagedOverrides.RouteOverridesProperty.Builder.() -> Unit
    = {}): CfnApiGatewayManagedOverrides.RouteOverridesProperty =
    CfnApiGatewayManagedOverrides.RouteOverridesProperty.builder().apply(initializer).build()
