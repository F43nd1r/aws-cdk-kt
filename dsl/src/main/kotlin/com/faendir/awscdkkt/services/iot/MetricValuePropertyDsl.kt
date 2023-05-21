package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@Generated
public
    fun metricValueProperty(initializer: CfnSecurityProfile.MetricValueProperty.Builder.() -> Unit =
    {}): CfnSecurityProfile.MetricValueProperty =
    CfnSecurityProfile.MetricValueProperty.builder().apply(initializer).build()
