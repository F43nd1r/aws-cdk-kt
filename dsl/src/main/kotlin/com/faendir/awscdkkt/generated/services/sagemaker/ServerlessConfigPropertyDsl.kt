package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public fun buildServerlessConfigProperty(initializer: @AwsCdkDsl
    CfnEndpointConfig.ServerlessConfigProperty.Builder.() -> Unit = {}):
    CfnEndpointConfig.ServerlessConfigProperty =
    CfnEndpointConfig.ServerlessConfigProperty.Builder().apply(initializer).build()
