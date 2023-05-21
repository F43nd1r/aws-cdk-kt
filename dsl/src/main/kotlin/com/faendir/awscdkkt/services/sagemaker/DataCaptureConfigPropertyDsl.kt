package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public
    fun dataCaptureConfigProperty(initializer: CfnEndpointConfig.DataCaptureConfigProperty.Builder.() -> Unit
    = {}): CfnEndpointConfig.DataCaptureConfigProperty =
    CfnEndpointConfig.DataCaptureConfigProperty.builder().apply(initializer).build()
