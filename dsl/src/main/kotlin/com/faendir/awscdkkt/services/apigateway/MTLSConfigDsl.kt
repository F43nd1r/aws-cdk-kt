package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.MTLSConfig

@Generated
public fun mTLSConfig(initializer: MTLSConfig.Builder.() -> Unit = {}): MTLSConfig =
    MTLSConfig.builder().apply(initializer).build()
