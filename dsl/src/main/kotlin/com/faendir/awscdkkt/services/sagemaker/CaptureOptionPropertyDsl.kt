package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public
    fun captureOptionProperty(initializer: CfnEndpointConfig.CaptureOptionProperty.Builder.() -> Unit
    = {}): CfnEndpointConfig.CaptureOptionProperty =
    CfnEndpointConfig.CaptureOptionProperty.builder().apply(initializer).build()
