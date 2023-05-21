package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@Generated
public
    fun productionVariantProperty(initializer: CfnEndpointConfig.ProductionVariantProperty.Builder.() -> Unit
    = {}): CfnEndpointConfig.ProductionVariantProperty =
    CfnEndpointConfig.ProductionVariantProperty.builder().apply(initializer).build()
