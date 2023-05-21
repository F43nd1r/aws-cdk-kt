package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public
    fun clarifyTextConfigProperty(initializer: CfnEndpointConfig.ClarifyTextConfigProperty.Builder.() -> Unit
    = {}): CfnEndpointConfig.ClarifyTextConfigProperty =
    CfnEndpointConfig.ClarifyTextConfigProperty.builder().apply(initializer).build()
