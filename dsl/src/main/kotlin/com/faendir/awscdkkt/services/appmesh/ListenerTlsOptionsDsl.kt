package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions

@Generated
public fun listenerTlsOptions(initializer: ListenerTlsOptions.Builder.() -> Unit = {}):
    ListenerTlsOptions = ListenerTlsOptions.builder().apply(initializer).build()
