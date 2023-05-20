@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

public
    fun metricDimensionProperty(initializer: CfnInstanceGroupConfig.MetricDimensionProperty.Builder.() -> Unit):
    CfnInstanceGroupConfig.MetricDimensionProperty =
    CfnInstanceGroupConfig.MetricDimensionProperty.builder().apply(initializer).build()
