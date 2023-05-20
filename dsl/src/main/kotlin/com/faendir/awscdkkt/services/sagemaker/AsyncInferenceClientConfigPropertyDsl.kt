@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

public
    fun asyncInferenceClientConfigProperty(initializer: CfnEndpointConfig.AsyncInferenceClientConfigProperty.Builder.() -> Unit):
    CfnEndpointConfig.AsyncInferenceClientConfigProperty =
    CfnEndpointConfig.AsyncInferenceClientConfigProperty.builder().apply(initializer).build()
