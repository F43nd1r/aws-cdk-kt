package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CachePolicyProps

@Generated
public fun cachePolicyProps(initializer: CachePolicyProps.Builder.() -> Unit = {}): CachePolicyProps
    = CachePolicyProps.builder().apply(initializer).build()
