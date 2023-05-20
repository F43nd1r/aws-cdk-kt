@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.MTLSConfig

public fun mTLSConfig(initializer: MTLSConfig.Builder.() -> Unit): MTLSConfig =
    MTLSConfig.builder().apply(initializer).build()
