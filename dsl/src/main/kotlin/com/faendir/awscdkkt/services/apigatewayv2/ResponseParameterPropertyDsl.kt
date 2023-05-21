package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration

@Generated
public
    fun responseParameterProperty(initializer: CfnIntegration.ResponseParameterProperty.Builder.() -> Unit
    = {}): CfnIntegration.ResponseParameterProperty =
    CfnIntegration.ResponseParameterProperty.builder().apply(initializer).build()
