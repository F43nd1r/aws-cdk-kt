@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

public
    fun virtualNodeSpecProperty(initializer: CfnVirtualNode.VirtualNodeSpecProperty.Builder.() -> Unit):
    CfnVirtualNode.VirtualNodeSpecProperty =
    CfnVirtualNode.VirtualNodeSpecProperty.builder().apply(initializer).build()
