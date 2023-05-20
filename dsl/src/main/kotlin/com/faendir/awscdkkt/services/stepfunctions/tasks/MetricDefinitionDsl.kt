@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition

public fun metricDefinition(initializer: MetricDefinition.Builder.() -> Unit): MetricDefinition =
    MetricDefinition.builder().apply(initializer).build()
