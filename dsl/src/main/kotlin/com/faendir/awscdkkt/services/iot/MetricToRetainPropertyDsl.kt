@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile

public
    fun metricToRetainProperty(initializer: CfnSecurityProfile.MetricToRetainProperty.Builder.() -> Unit):
    CfnSecurityProfile.MetricToRetainProperty =
    CfnSecurityProfile.MetricToRetainProperty.builder().apply(initializer).build()
