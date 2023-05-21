package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig

@Generated
public fun virtualNodeListenerConfig(initializer: VirtualNodeListenerConfig.Builder.() -> Unit =
    {}): VirtualNodeListenerConfig = VirtualNodeListenerConfig.builder().apply(initializer).build()
