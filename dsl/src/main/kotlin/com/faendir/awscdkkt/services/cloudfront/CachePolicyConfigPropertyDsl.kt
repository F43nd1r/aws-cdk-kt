package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy

@Generated
public
    fun cachePolicyConfigProperty(initializer: CfnCachePolicy.CachePolicyConfigProperty.Builder.() -> Unit
    = {}): CfnCachePolicy.CachePolicyConfigProperty =
    CfnCachePolicy.CachePolicyConfigProperty.builder().apply(initializer).build()
