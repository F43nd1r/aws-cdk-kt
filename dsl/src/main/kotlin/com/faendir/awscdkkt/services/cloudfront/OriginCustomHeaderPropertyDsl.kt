package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun originCustomHeaderProperty(initializer: CfnDistribution.OriginCustomHeaderProperty.Builder.() -> Unit
    = {}): CfnDistribution.OriginCustomHeaderProperty =
    CfnDistribution.OriginCustomHeaderProperty.builder().apply(initializer).build()
