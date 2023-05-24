package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.MetricStatConfig

@Generated
public fun buildMetricStatConfig(initializer: @AwsCdkDsl MetricStatConfig.Builder.() -> Unit):
    MetricStatConfig = MetricStatConfig.Builder().apply(initializer).build()
