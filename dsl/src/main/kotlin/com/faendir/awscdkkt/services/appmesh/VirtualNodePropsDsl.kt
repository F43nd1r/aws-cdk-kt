package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualNodeProps

@Generated
public fun virtualNodeProps(initializer: VirtualNodeProps.Builder.() -> Unit = {}): VirtualNodeProps
    = VirtualNodeProps.builder().apply(initializer).build()
