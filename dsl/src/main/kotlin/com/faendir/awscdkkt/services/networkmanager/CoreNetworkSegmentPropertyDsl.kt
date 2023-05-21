package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnCoreNetwork

@Generated
public
    fun coreNetworkSegmentProperty(initializer: CfnCoreNetwork.CoreNetworkSegmentProperty.Builder.() -> Unit
    = {}): CfnCoreNetwork.CoreNetworkSegmentProperty =
    CfnCoreNetwork.CoreNetworkSegmentProperty.builder().apply(initializer).build()
