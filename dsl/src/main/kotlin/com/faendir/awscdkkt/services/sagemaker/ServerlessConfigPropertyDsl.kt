@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

public
    fun serverlessConfigProperty(initializer: CfnEndpointConfig.ServerlessConfigProperty.Builder.() -> Unit):
    CfnEndpointConfig.ServerlessConfigProperty =
    CfnEndpointConfig.ServerlessConfigProperty.builder().apply(initializer).build()
