@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun originCustomHeaderProperty(initializer: CfnDistribution.OriginCustomHeaderProperty.Builder.() -> Unit):
    CfnDistribution.OriginCustomHeaderProperty =
    CfnDistribution.OriginCustomHeaderProperty.builder().apply(initializer).build()
