package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides

@Generated
public
    fun integrationOverridesProperty(initializer: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.Builder.() -> Unit
    = {}): CfnApiGatewayManagedOverrides.IntegrationOverridesProperty =
    CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.builder().apply(initializer).build()
