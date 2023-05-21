package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration

@Generated
public fun tlsConfigProperty(initializer: CfnIntegration.TlsConfigProperty.Builder.() -> Unit = {}):
    CfnIntegration.TlsConfigProperty =
    CfnIntegration.TlsConfigProperty.builder().apply(initializer).build()
