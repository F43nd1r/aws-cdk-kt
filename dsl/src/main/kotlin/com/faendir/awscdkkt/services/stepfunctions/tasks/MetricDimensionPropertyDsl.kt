package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun metricDimensionProperty(initializer: EmrCreateCluster.MetricDimensionProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.MetricDimensionProperty =
    EmrCreateCluster.MetricDimensionProperty.builder().apply(initializer).build()
