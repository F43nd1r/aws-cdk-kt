package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public
    fun clarifyExplainerConfigProperty(initializer: CfnEndpointConfig.ClarifyExplainerConfigProperty.Builder.() -> Unit
    = {}): CfnEndpointConfig.ClarifyExplainerConfigProperty =
    CfnEndpointConfig.ClarifyExplainerConfigProperty.builder().apply(initializer).build()
