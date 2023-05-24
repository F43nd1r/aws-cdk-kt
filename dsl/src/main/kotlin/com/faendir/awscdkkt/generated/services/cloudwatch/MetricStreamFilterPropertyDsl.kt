package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

@Generated
public fun buildMetricStreamFilterProperty(initializer: @AwsCdkDsl
    CfnMetricStream.MetricStreamFilterProperty.Builder.() -> Unit):
    CfnMetricStream.MetricStreamFilterProperty =
    CfnMetricStream.MetricStreamFilterProperty.Builder().apply(initializer).build()
