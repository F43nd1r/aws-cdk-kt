package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun legacyCustomOriginProperty(initializer: CfnDistribution.LegacyCustomOriginProperty.Builder.() -> Unit
    = {}): CfnDistribution.LegacyCustomOriginProperty =
    CfnDistribution.LegacyCustomOriginProperty.builder().apply(initializer).build()
