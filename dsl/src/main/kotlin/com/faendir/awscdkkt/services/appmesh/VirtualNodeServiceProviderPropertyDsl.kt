package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualService

@Generated
public
    fun virtualNodeServiceProviderProperty(initializer: CfnVirtualService.VirtualNodeServiceProviderProperty.Builder.() -> Unit
    = {}): CfnVirtualService.VirtualNodeServiceProviderProperty =
    CfnVirtualService.VirtualNodeServiceProviderProperty.builder().apply(initializer).build()
