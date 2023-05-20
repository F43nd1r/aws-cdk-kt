@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer

public
    fun jWTConfigurationProperty(initializer: CfnAuthorizer.JWTConfigurationProperty.Builder.() -> Unit):
    CfnAuthorizer.JWTConfigurationProperty =
    CfnAuthorizer.JWTConfigurationProperty.builder().apply(initializer).build()
