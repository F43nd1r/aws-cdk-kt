package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun virtualNodeSpecProperty(initializer: CfnVirtualNode.VirtualNodeSpecProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.VirtualNodeSpecProperty =
    CfnVirtualNode.VirtualNodeSpecProperty.builder().apply(initializer).build()
