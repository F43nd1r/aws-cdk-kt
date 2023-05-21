package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun serviceDiscoveryProperty(initializer: CfnVirtualNode.ServiceDiscoveryProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ServiceDiscoveryProperty =
    CfnVirtualNode.ServiceDiscoveryProperty.builder().apply(initializer).build()
