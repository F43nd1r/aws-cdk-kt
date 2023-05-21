package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@Generated
public
    fun connectionDetailsProperty(initializer: CfnDataflowEndpointGroup.ConnectionDetailsProperty.Builder.() -> Unit
    = {}): CfnDataflowEndpointGroup.ConnectionDetailsProperty =
    CfnDataflowEndpointGroup.ConnectionDetailsProperty.builder().apply(initializer).build()
