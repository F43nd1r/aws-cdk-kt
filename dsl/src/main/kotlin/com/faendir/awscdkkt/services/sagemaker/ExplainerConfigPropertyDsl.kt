@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

public
    fun explainerConfigProperty(initializer: CfnEndpointConfig.ExplainerConfigProperty.Builder.() -> Unit):
    CfnEndpointConfig.ExplainerConfigProperty =
    CfnEndpointConfig.ExplainerConfigProperty.builder().apply(initializer).build()
