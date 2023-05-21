package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun geoRestrictionProperty(initializer: CfnDistribution.GeoRestrictionProperty.Builder.() -> Unit
    = {}): CfnDistribution.GeoRestrictionProperty =
    CfnDistribution.GeoRestrictionProperty.builder().apply(initializer).build()
