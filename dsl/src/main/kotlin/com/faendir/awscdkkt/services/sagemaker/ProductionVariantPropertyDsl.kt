@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

public
    fun productionVariantProperty(initializer: CfnEndpointConfig.ProductionVariantProperty.Builder.() -> Unit):
    CfnEndpointConfig.ProductionVariantProperty =
    CfnEndpointConfig.ProductionVariantProperty.builder().apply(initializer).build()
