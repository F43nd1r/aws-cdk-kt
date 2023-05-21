package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public
    fun explainerConfigProperty(initializer: CfnEndpointConfig.ExplainerConfigProperty.Builder.() -> Unit
    = {}): CfnEndpointConfig.ExplainerConfigProperty =
    CfnEndpointConfig.ExplainerConfigProperty.builder().apply(initializer).build()
