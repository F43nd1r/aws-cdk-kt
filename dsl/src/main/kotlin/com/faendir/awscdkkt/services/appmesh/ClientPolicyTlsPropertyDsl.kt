package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun clientPolicyTlsProperty(initializer: CfnVirtualNode.ClientPolicyTlsProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ClientPolicyTlsProperty =
    CfnVirtualNode.ClientPolicyTlsProperty.builder().apply(initializer).build()
