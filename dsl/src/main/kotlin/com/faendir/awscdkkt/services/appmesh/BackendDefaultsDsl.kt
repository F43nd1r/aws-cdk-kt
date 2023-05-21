package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.BackendDefaults

@Generated
public fun backendDefaults(initializer: BackendDefaults.Builder.() -> Unit = {}): BackendDefaults =
    BackendDefaults.builder().apply(initializer).build()
