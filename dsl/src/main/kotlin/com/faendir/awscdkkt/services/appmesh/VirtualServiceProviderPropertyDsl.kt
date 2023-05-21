package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualService

@Generated
public
    fun virtualServiceProviderProperty(initializer: CfnVirtualService.VirtualServiceProviderProperty.Builder.() -> Unit
    = {}): CfnVirtualService.VirtualServiceProviderProperty =
    CfnVirtualService.VirtualServiceProviderProperty.builder().apply(initializer).build()
