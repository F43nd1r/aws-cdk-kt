package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public
    fun clarifyInferenceConfigProperty(initializer: CfnEndpointConfig.ClarifyInferenceConfigProperty.Builder.() -> Unit
    = {}): CfnEndpointConfig.ClarifyInferenceConfigProperty =
    CfnEndpointConfig.ClarifyInferenceConfigProperty.builder().apply(initializer).build()
