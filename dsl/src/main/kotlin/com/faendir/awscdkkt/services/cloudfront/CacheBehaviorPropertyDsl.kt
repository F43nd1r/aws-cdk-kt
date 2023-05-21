package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun cacheBehaviorProperty(initializer: CfnDistribution.CacheBehaviorProperty.Builder.() -> Unit
    = {}): CfnDistribution.CacheBehaviorProperty =
    CfnDistribution.CacheBehaviorProperty.builder().apply(initializer).build()
