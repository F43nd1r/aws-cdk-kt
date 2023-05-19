@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRestApi

public
    fun endpointConfigurationProperty(initializer: CfnRestApi.EndpointConfigurationProperty.Builder.() -> Unit):
    CfnRestApi.EndpointConfigurationProperty =
    CfnRestApi.EndpointConfigurationProperty.builder().apply(initializer).build()
