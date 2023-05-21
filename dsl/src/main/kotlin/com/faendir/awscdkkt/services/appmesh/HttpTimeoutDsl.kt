package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpTimeout

@Generated
public fun httpTimeout(initializer: HttpTimeout.Builder.() -> Unit = {}): HttpTimeout =
    HttpTimeout.builder().apply(initializer).build()
