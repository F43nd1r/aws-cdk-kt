package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer

@Generated
public
    fun jWTConfigurationProperty(initializer: CfnAuthorizer.JWTConfigurationProperty.Builder.() -> Unit
    = {}): CfnAuthorizer.JWTConfigurationProperty =
    CfnAuthorizer.JWTConfigurationProperty.builder().apply(initializer).build()
