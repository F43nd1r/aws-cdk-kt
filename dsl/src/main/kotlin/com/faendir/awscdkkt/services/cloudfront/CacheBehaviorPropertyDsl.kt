@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun cacheBehaviorProperty(initializer: CfnDistribution.CacheBehaviorProperty.Builder.() -> Unit):
    CfnDistribution.CacheBehaviorProperty =
    CfnDistribution.CacheBehaviorProperty.builder().apply(initializer).build()
