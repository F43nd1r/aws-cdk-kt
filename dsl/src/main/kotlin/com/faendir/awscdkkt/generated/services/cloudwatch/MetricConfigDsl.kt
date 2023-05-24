package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricConfig

@Generated
public fun buildMetricConfig(initializer: @AwsCdkDsl MetricConfig.Builder.() -> Unit): MetricConfig
    = MetricConfig.Builder().apply(initializer).build()
