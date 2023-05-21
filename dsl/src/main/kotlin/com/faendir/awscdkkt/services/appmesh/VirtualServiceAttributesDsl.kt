package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualServiceAttributes

@Generated
public fun virtualServiceAttributes(initializer: VirtualServiceAttributes.Builder.() -> Unit = {}):
    VirtualServiceAttributes = VirtualServiceAttributes.builder().apply(initializer).build()
