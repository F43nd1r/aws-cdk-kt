package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter

@Generated
public
    fun virtualRouterSpecProperty(initializer: CfnVirtualRouter.VirtualRouterSpecProperty.Builder.() -> Unit
    = {}): CfnVirtualRouter.VirtualRouterSpecProperty =
    CfnVirtualRouter.VirtualRouterSpecProperty.builder().apply(initializer).build()
