package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public fun restrictionsProperty(initializer: CfnDistribution.RestrictionsProperty.Builder.() -> Unit
    = {}): CfnDistribution.RestrictionsProperty =
    CfnDistribution.RestrictionsProperty.builder().apply(initializer).build()
