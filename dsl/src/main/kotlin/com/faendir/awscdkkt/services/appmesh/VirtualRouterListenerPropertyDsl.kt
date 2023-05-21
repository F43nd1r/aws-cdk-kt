package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter

@Generated
public
    fun virtualRouterListenerProperty(initializer: CfnVirtualRouter.VirtualRouterListenerProperty.Builder.() -> Unit
    = {}): CfnVirtualRouter.VirtualRouterListenerProperty =
    CfnVirtualRouter.VirtualRouterListenerProperty.builder().apply(initializer).build()
