package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginProps

@Generated
public fun originProps(initializer: OriginProps.Builder.() -> Unit = {}): OriginProps =
    OriginProps.builder().apply(initializer).build()
