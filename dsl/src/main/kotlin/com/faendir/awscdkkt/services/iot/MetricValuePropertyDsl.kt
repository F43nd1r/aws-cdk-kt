@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile

public
    fun metricValueProperty(initializer: CfnSecurityProfile.MetricValueProperty.Builder.() -> Unit):
    CfnSecurityProfile.MetricValueProperty =
    CfnSecurityProfile.MetricValueProperty.builder().apply(initializer).build()
