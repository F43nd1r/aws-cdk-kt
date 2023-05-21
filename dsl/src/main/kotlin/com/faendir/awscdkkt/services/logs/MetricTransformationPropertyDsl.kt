package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnMetricFilter

@Generated
public
    fun metricTransformationProperty(initializer: CfnMetricFilter.MetricTransformationProperty.Builder.() -> Unit
    = {}): CfnMetricFilter.MetricTransformationProperty =
    CfnMetricFilter.MetricTransformationProperty.builder().apply(initializer).build()
