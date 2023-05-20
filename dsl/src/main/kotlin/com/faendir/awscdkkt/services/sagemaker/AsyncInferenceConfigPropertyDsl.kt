@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

public
    fun asyncInferenceConfigProperty(initializer: CfnEndpointConfig.AsyncInferenceConfigProperty.Builder.() -> Unit):
    CfnEndpointConfig.AsyncInferenceConfigProperty =
    CfnEndpointConfig.AsyncInferenceConfigProperty.builder().apply(initializer).build()
