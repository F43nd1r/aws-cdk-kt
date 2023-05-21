package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDistribution

@Generated
public
    fun cacheBehaviorPerPathProperty(initializer: CfnDistribution.CacheBehaviorPerPathProperty.Builder.() -> Unit
    = {}): CfnDistribution.CacheBehaviorPerPathProperty =
    CfnDistribution.CacheBehaviorPerPathProperty.builder().apply(initializer).build()
