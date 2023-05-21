package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricProps

@Generated
public fun metricProps(initializer: MetricProps.Builder.() -> Unit = {}): MetricProps =
    MetricProps.builder().apply(initializer).build()
