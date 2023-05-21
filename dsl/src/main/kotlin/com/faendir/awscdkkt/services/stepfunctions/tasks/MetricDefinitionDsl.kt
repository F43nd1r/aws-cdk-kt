package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition

@Generated
public fun metricDefinition(initializer: MetricDefinition.Builder.() -> Unit = {}): MetricDefinition
    = MetricDefinition.builder().apply(initializer).build()
