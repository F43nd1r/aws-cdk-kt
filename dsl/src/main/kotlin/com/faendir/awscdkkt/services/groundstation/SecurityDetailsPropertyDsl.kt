package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@Generated
public
    fun securityDetailsProperty(initializer: CfnDataflowEndpointGroup.SecurityDetailsProperty.Builder.() -> Unit
    = {}): CfnDataflowEndpointGroup.SecurityDetailsProperty =
    CfnDataflowEndpointGroup.SecurityDetailsProperty.builder().apply(initializer).build()
