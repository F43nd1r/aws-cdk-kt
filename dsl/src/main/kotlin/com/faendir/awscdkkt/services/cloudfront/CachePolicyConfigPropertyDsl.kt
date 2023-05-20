@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy

public
    fun cachePolicyConfigProperty(initializer: CfnCachePolicy.CachePolicyConfigProperty.Builder.() -> Unit):
    CfnCachePolicy.CachePolicyConfigProperty =
    CfnCachePolicy.CachePolicyConfigProperty.builder().apply(initializer).build()
