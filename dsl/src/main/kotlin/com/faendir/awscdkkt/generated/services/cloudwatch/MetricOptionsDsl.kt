package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricOptions

@Generated
public fun buildMetricOptions(initializer: @AwsCdkDsl MetricOptions.Builder.() -> Unit = {}):
    MetricOptions = MetricOptions.Builder().apply(initializer).build()
