package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRestApi

@Generated
public
    fun endpointConfigurationProperty(initializer: CfnRestApi.EndpointConfigurationProperty.Builder.() -> Unit
    = {}): CfnRestApi.EndpointConfigurationProperty =
    CfnRestApi.EndpointConfigurationProperty.builder().apply(initializer).build()
