@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricConfig

public fun metricConfig(initializer: MetricConfig.Builder.() -> Unit): MetricConfig =
    MetricConfig.builder().apply(initializer).build()
