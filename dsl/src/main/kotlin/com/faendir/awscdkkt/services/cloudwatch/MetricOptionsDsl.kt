package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricOptions

@Generated
public fun metricOptions(initializer: MetricOptions.Builder.() -> Unit = {}): MetricOptions =
    MetricOptions.builder().apply(initializer).build()
