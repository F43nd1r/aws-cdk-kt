package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.MetricFilterOptions

@Generated
public fun metricFilterOptions(initializer: MetricFilterOptions.Builder.() -> Unit = {}):
    MetricFilterOptions = MetricFilterOptions.builder().apply(initializer).build()
