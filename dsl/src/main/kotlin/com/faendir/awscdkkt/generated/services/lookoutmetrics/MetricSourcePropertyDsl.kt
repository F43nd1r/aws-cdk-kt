package com.faendir.awscdkkt.generated.services.lookoutmetrics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public fun buildMetricSourceProperty(initializer: @AwsCdkDsl
    CfnAnomalyDetector.MetricSourceProperty.Builder.() -> Unit = {}):
    CfnAnomalyDetector.MetricSourceProperty =
    CfnAnomalyDetector.MetricSourceProperty.Builder().apply(initializer).build()
