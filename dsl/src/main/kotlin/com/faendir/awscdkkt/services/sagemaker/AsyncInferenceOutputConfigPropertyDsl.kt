package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public
    fun asyncInferenceOutputConfigProperty(initializer: CfnEndpointConfig.AsyncInferenceOutputConfigProperty.Builder.() -> Unit
    = {}): CfnEndpointConfig.AsyncInferenceOutputConfigProperty =
    CfnEndpointConfig.AsyncInferenceOutputConfigProperty.builder().apply(initializer).build()
