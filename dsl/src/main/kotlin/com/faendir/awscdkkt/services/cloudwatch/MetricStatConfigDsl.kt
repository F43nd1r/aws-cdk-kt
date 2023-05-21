package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricStatConfig

@Generated
public fun metricStatConfig(initializer: MetricStatConfig.Builder.() -> Unit = {}): MetricStatConfig
    = MetricStatConfig.builder().apply(initializer).build()
