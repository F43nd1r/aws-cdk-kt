package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun forwardedValuesProperty(initializer: CfnDistribution.ForwardedValuesProperty.Builder.() -> Unit
    = {}): CfnDistribution.ForwardedValuesProperty =
    CfnDistribution.ForwardedValuesProperty.builder().apply(initializer).build()
