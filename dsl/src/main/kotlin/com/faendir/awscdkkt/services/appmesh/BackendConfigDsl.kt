package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.BackendConfig

@Generated
public fun backendConfig(initializer: BackendConfig.Builder.() -> Unit = {}): BackendConfig =
    BackendConfig.builder().apply(initializer).build()
