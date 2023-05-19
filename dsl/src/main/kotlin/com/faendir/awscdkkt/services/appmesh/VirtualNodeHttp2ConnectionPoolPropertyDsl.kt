@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

public
    fun virtualNodeHttp2ConnectionPoolProperty(initializer: CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.Builder.() -> Unit):
    CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty =
    CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty.builder().apply(initializer).build()
