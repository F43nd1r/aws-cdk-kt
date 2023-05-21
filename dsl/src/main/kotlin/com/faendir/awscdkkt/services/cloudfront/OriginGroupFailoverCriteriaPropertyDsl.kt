package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun originGroupFailoverCriteriaProperty(initializer: CfnDistribution.OriginGroupFailoverCriteriaProperty.Builder.() -> Unit
    = {}): CfnDistribution.OriginGroupFailoverCriteriaProperty =
    CfnDistribution.OriginGroupFailoverCriteriaProperty.builder().apply(initializer).build()
