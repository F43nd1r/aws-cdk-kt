package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig

@Generated
public fun taskMetricsConfig(initializer: TaskMetricsConfig.Builder.() -> Unit = {}):
    TaskMetricsConfig = TaskMetricsConfig.builder().apply(initializer).build()
