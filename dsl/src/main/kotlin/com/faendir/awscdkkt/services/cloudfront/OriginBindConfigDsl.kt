package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginBindConfig

@Generated
public fun originBindConfig(initializer: OriginBindConfig.Builder.() -> Unit = {}): OriginBindConfig
    = OriginBindConfig.builder().apply(initializer).build()
