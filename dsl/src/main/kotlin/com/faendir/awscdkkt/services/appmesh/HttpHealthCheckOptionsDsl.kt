package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions

@Generated
public fun httpHealthCheckOptions(initializer: HttpHealthCheckOptions.Builder.() -> Unit = {}):
    HttpHealthCheckOptions = HttpHealthCheckOptions.builder().apply(initializer).build()
