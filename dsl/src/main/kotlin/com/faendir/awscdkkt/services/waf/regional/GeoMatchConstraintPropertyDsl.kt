package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet

@Generated
public
    fun geoMatchConstraintProperty(initializer: CfnGeoMatchSet.GeoMatchConstraintProperty.Builder.() -> Unit
    = {}): CfnGeoMatchSet.GeoMatchConstraintProperty =
    CfnGeoMatchSet.GeoMatchConstraintProperty.builder().apply(initializer).build()
