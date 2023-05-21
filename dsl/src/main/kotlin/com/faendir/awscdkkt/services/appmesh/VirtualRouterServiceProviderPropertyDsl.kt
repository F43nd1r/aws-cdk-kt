package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualService

@Generated
public
    fun virtualRouterServiceProviderProperty(initializer: CfnVirtualService.VirtualRouterServiceProviderProperty.Builder.() -> Unit
    = {}): CfnVirtualService.VirtualRouterServiceProviderProperty =
    CfnVirtualService.VirtualRouterServiceProviderProperty.builder().apply(initializer).build()
