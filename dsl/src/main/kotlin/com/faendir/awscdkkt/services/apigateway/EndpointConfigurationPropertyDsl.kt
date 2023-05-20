@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRestApi

public
    fun endpointConfigurationProperty(initializer: CfnRestApi.EndpointConfigurationProperty.Builder.() -> Unit):
    CfnRestApi.EndpointConfigurationProperty =
    CfnRestApi.EndpointConfigurationProperty.builder().apply(initializer).build()
