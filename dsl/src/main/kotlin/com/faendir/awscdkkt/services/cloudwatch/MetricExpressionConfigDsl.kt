package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig

@Generated
public fun metricExpressionConfig(initializer: MetricExpressionConfig.Builder.() -> Unit = {}):
    MetricExpressionConfig = MetricExpressionConfig.builder().apply(initializer).build()
