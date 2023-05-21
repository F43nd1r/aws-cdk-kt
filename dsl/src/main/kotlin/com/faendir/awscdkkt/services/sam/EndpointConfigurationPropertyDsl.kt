package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApi

@Generated
public
    fun endpointConfigurationProperty(initializer: CfnApi.EndpointConfigurationProperty.Builder.() -> Unit
    = {}): CfnApi.EndpointConfigurationProperty =
    CfnApi.EndpointConfigurationProperty.builder().apply(initializer).build()
