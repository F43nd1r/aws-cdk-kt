package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public fun originProperty(initializer: CfnDistribution.OriginProperty.Builder.() -> Unit = {}):
    CfnDistribution.OriginProperty =
    CfnDistribution.OriginProperty.builder().apply(initializer).build()
