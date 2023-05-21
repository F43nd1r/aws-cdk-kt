package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun dnsServiceDiscoveryProperty(initializer: CfnVirtualNode.DnsServiceDiscoveryProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.DnsServiceDiscoveryProperty =
    CfnVirtualNode.DnsServiceDiscoveryProperty.builder().apply(initializer).build()
