package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualNodeAttributes

@Generated
public fun virtualNodeAttributes(initializer: VirtualNodeAttributes.Builder.() -> Unit = {}):
    VirtualNodeAttributes = VirtualNodeAttributes.builder().apply(initializer).build()
