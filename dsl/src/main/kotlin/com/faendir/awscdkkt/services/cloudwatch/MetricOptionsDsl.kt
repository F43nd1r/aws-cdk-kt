@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricOptions

public fun metricOptions(initializer: MetricOptions.Builder.() -> Unit): MetricOptions =
    MetricOptions.builder().apply(initializer).build()
