@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet

public
    fun geoMatchConstraintProperty(initializer: CfnGeoMatchSet.GeoMatchConstraintProperty.Builder.() -> Unit):
    CfnGeoMatchSet.GeoMatchConstraintProperty =
    CfnGeoMatchSet.GeoMatchConstraintProperty.builder().apply(initializer).build()
