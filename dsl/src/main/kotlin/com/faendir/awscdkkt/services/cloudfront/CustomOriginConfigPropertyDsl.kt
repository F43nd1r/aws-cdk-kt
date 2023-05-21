package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun customOriginConfigProperty(initializer: CfnDistribution.CustomOriginConfigProperty.Builder.() -> Unit
    = {}): CfnDistribution.CustomOriginConfigProperty =
    CfnDistribution.CustomOriginConfigProperty.builder().apply(initializer).build()
