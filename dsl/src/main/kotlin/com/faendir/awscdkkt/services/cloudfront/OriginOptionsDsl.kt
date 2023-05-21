package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginOptions

@Generated
public fun originOptions(initializer: OriginOptions.Builder.() -> Unit = {}): OriginOptions =
    OriginOptions.builder().apply(initializer).build()
