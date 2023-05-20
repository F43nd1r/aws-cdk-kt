@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualService

public
    fun virtualRouterServiceProviderProperty(initializer: CfnVirtualService.VirtualRouterServiceProviderProperty.Builder.() -> Unit):
    CfnVirtualService.VirtualRouterServiceProviderProperty =
    CfnVirtualService.VirtualRouterServiceProviderProperty.builder().apply(initializer).build()
