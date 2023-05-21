package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun customErrorResponseProperty(initializer: CfnDistribution.CustomErrorResponseProperty.Builder.() -> Unit
    = {}): CfnDistribution.CustomErrorResponseProperty =
    CfnDistribution.CustomErrorResponseProperty.builder().apply(initializer).build()
