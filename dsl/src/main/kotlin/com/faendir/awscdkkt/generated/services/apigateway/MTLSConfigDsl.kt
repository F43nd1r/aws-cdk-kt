package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.MTLSConfig

@Generated
public fun buildMTLSConfig(initializer: @AwsCdkDsl MTLSConfig.Builder.() -> Unit): MTLSConfig =
    MTLSConfig.Builder().apply(initializer).build()
