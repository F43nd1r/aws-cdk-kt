@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualService

public
    fun virtualServiceSpecProperty(initializer: CfnVirtualService.VirtualServiceSpecProperty.Builder.() -> Unit):
    CfnVirtualService.VirtualServiceSpecProperty =
    CfnVirtualService.VirtualServiceSpecProperty.builder().apply(initializer).build()
