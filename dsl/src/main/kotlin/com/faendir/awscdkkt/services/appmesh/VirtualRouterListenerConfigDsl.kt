package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig

@Generated
public fun virtualRouterListenerConfig(initializer: VirtualRouterListenerConfig.Builder.() -> Unit =
    {}): VirtualRouterListenerConfig =
    VirtualRouterListenerConfig.builder().apply(initializer).build()
