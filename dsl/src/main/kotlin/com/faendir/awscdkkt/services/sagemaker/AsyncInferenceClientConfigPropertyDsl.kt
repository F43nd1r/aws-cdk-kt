@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

public
    fun asyncInferenceClientConfigProperty(initializer: CfnEndpointConfig.AsyncInferenceClientConfigProperty.Builder.() -> Unit):
    CfnEndpointConfig.AsyncInferenceClientConfigProperty =
    CfnEndpointConfig.AsyncInferenceClientConfigProperty.builder().apply(initializer).build()
