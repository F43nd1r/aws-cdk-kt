@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig

public fun metricExpressionConfig(initializer: MetricExpressionConfig.Builder.() -> Unit):
    MetricExpressionConfig = MetricExpressionConfig.builder().apply(initializer).build()
