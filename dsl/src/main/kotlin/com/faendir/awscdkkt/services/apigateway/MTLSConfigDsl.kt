@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.MTLSConfig

public fun mTLSConfig(initializer: MTLSConfig.Builder.() -> Unit): MTLSConfig =
    MTLSConfig.builder().apply(initializer).build()
