@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

public
    fun virtualNodeTcpConnectionPoolProperty(initializer: CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.Builder.() -> Unit):
    CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty =
    CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty.builder().apply(initializer).build()
