package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public
    fun asyncInferenceConfigProperty(initializer: CfnEndpointConfig.AsyncInferenceConfigProperty.Builder.() -> Unit
    = {}): CfnEndpointConfig.AsyncInferenceConfigProperty =
    CfnEndpointConfig.AsyncInferenceConfigProperty.builder().apply(initializer).build()
