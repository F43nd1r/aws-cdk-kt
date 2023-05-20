@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun forwardedValuesProperty(initializer: CfnDistribution.ForwardedValuesProperty.Builder.() -> Unit):
    CfnDistribution.ForwardedValuesProperty =
    CfnDistribution.ForwardedValuesProperty.builder().apply(initializer).build()
