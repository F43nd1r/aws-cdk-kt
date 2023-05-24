package com.faendir.awscdkkt.generated.services.lookoutmetrics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public fun buildMetricProperty(initializer: @AwsCdkDsl
    CfnAnomalyDetector.MetricProperty.Builder.() -> Unit): CfnAnomalyDetector.MetricProperty =
    CfnAnomalyDetector.MetricProperty.Builder().apply(initializer).build()
