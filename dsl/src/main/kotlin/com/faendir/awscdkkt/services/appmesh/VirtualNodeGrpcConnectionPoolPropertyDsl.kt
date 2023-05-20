@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

public
    fun virtualNodeGrpcConnectionPoolProperty(initializer: CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.Builder.() -> Unit):
    CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty =
    CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty.builder().apply(initializer).build()
