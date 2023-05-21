package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnCoreNetwork

@Generated
public
    fun coreNetworkEdgeProperty(initializer: CfnCoreNetwork.CoreNetworkEdgeProperty.Builder.() -> Unit
    = {}): CfnCoreNetwork.CoreNetworkEdgeProperty =
    CfnCoreNetwork.CoreNetworkEdgeProperty.builder().apply(initializer).build()
