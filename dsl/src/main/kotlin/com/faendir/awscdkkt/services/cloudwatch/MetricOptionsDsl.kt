@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricOptions

public fun metricOptions(initializer: MetricOptions.Builder.() -> Unit): MetricOptions =
    MetricOptions.builder().apply(initializer).build()
