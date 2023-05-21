package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides

@Generated
public
    fun stageOverridesProperty(initializer: CfnApiGatewayManagedOverrides.StageOverridesProperty.Builder.() -> Unit
    = {}): CfnApiGatewayManagedOverrides.StageOverridesProperty =
    CfnApiGatewayManagedOverrides.StageOverridesProperty.builder().apply(initializer).build()
