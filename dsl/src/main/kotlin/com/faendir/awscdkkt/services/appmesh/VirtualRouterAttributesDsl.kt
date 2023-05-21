package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualRouterAttributes

@Generated
public fun virtualRouterAttributes(initializer: VirtualRouterAttributes.Builder.() -> Unit = {}):
    VirtualRouterAttributes = VirtualRouterAttributes.builder().apply(initializer).build()
