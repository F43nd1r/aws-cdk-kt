package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TlsClientPolicy

@Generated
public fun tlsClientPolicy(initializer: TlsClientPolicy.Builder.() -> Unit = {}): TlsClientPolicy =
    TlsClientPolicy.builder().apply(initializer).build()
