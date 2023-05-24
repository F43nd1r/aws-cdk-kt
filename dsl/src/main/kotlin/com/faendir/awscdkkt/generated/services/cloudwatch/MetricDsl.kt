package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric

@Generated
public fun buildMetric(initializer: @AwsCdkDsl Metric.Builder.() -> Unit): Metric =
    Metric.Builder.create().apply(initializer).build()
