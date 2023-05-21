package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public fun clientPolicyProperty(initializer: CfnVirtualNode.ClientPolicyProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.ClientPolicyProperty =
    CfnVirtualNode.ClientPolicyProperty.builder().apply(initializer).build()
