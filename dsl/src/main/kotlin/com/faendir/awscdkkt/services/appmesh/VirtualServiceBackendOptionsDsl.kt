package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions

@Generated
public fun virtualServiceBackendOptions(initializer: VirtualServiceBackendOptions.Builder.() -> Unit
    = {}): VirtualServiceBackendOptions =
    VirtualServiceBackendOptions.builder().apply(initializer).build()
