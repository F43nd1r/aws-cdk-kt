package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@Generated
public
    fun endpointDetailsProperty(initializer: CfnDataflowEndpointGroup.EndpointDetailsProperty.Builder.() -> Unit
    = {}): CfnDataflowEndpointGroup.EndpointDetailsProperty =
    CfnDataflowEndpointGroup.EndpointDetailsProperty.builder().apply(initializer).build()
