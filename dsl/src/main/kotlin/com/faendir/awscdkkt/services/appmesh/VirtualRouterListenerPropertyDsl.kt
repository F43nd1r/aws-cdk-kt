@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter

public
    fun virtualRouterListenerProperty(initializer: CfnVirtualRouter.VirtualRouterListenerProperty.Builder.() -> Unit):
    CfnVirtualRouter.VirtualRouterListenerProperty =
    CfnVirtualRouter.VirtualRouterListenerProperty.builder().apply(initializer).build()
