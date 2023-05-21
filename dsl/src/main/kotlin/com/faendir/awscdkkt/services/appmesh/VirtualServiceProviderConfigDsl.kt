package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig

@Generated
public fun virtualServiceProviderConfig(initializer: VirtualServiceProviderConfig.Builder.() -> Unit
    = {}): VirtualServiceProviderConfig =
    VirtualServiceProviderConfig.builder().apply(initializer).build()
