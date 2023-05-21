package com.faendir.awscdkkt.services.cloudfront.origins

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps

@Generated
public fun originGroupProps(initializer: OriginGroupProps.Builder.() -> Unit = {}): OriginGroupProps
    = OriginGroupProps.builder().apply(initializer).build()
