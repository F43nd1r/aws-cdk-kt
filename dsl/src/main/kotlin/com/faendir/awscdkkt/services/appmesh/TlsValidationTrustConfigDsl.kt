package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig

@Generated
public fun tlsValidationTrustConfig(initializer: TlsValidationTrustConfig.Builder.() -> Unit = {}):
    TlsValidationTrustConfig = TlsValidationTrustConfig.builder().apply(initializer).build()
