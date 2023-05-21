package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@Generated
public
    fun metricDimensionProperty(initializer: CfnSecurityProfile.MetricDimensionProperty.Builder.() -> Unit
    = {}): CfnSecurityProfile.MetricDimensionProperty =
    CfnSecurityProfile.MetricDimensionProperty.builder().apply(initializer).build()
