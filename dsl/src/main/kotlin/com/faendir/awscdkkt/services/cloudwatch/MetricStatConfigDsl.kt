@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricStatConfig

public fun metricStatConfig(initializer: MetricStatConfig.Builder.() -> Unit): MetricStatConfig =
    MetricStatConfig.builder().apply(initializer).build()
