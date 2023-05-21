package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public
    fun asyncInferenceClientConfigProperty(initializer: CfnEndpointConfig.AsyncInferenceClientConfigProperty.Builder.() -> Unit
    = {}): CfnEndpointConfig.AsyncInferenceClientConfigProperty =
    CfnEndpointConfig.AsyncInferenceClientConfigProperty.builder().apply(initializer).build()
