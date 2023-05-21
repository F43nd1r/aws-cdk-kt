package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public fun originShieldProperty(initializer: CfnDistribution.OriginShieldProperty.Builder.() -> Unit
    = {}): CfnDistribution.OriginShieldProperty =
    CfnDistribution.OriginShieldProperty.builder().apply(initializer).build()
