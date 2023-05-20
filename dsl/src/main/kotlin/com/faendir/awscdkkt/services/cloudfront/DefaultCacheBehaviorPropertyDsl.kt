@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun defaultCacheBehaviorProperty(initializer: CfnDistribution.DefaultCacheBehaviorProperty.Builder.() -> Unit):
    CfnDistribution.DefaultCacheBehaviorProperty =
    CfnDistribution.DefaultCacheBehaviorProperty.builder().apply(initializer).build()
