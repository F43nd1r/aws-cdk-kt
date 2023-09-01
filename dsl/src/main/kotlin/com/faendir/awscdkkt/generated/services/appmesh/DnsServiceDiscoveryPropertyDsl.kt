package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun buildDnsServiceDiscoveryProperty(initializer: @AwsCdkDsl
    CfnVirtualNode.DnsServiceDiscoveryProperty.Builder.() -> Unit = {}):
    CfnVirtualNode.DnsServiceDiscoveryProperty =
    CfnVirtualNode.DnsServiceDiscoveryProperty.Builder().apply(initializer).build()
