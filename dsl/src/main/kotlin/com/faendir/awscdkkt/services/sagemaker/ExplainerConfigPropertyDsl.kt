@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

public
    fun explainerConfigProperty(initializer: CfnEndpointConfig.ExplainerConfigProperty.Builder.() -> Unit):
    CfnEndpointConfig.ExplainerConfigProperty =
    CfnEndpointConfig.ExplainerConfigProperty.builder().apply(initializer).build()
