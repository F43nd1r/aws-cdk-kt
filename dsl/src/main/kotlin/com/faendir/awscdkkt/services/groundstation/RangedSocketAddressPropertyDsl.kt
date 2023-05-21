package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@Generated
public
    fun rangedSocketAddressProperty(initializer: CfnDataflowEndpointGroup.RangedSocketAddressProperty.Builder.() -> Unit
    = {}): CfnDataflowEndpointGroup.RangedSocketAddressProperty =
    CfnDataflowEndpointGroup.RangedSocketAddressProperty.builder().apply(initializer).build()
