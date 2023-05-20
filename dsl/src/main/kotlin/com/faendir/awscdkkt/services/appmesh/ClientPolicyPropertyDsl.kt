@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

public
    fun clientPolicyProperty(initializer: CfnVirtualNode.ClientPolicyProperty.Builder.() -> Unit):
    CfnVirtualNode.ClientPolicyProperty =
    CfnVirtualNode.ClientPolicyProperty.builder().apply(initializer).build()
