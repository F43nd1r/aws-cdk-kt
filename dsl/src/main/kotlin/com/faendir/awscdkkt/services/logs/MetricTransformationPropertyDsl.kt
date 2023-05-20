@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnMetricFilter

public
    fun metricTransformationProperty(initializer: CfnMetricFilter.MetricTransformationProperty.Builder.() -> Unit):
    CfnMetricFilter.MetricTransformationProperty =
    CfnMetricFilter.MetricTransformationProperty.builder().apply(initializer).build()
