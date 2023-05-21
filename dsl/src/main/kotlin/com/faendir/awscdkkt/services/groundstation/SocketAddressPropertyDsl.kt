package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@Generated
public
    fun socketAddressProperty(initializer: CfnDataflowEndpointGroup.SocketAddressProperty.Builder.() -> Unit
    = {}): CfnDataflowEndpointGroup.SocketAddressProperty =
    CfnDataflowEndpointGroup.SocketAddressProperty.builder().apply(initializer).build()
