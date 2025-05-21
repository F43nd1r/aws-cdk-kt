package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AnomalyDetectionMetricOptions

@Generated
public fun buildAnomalyDetectionMetricOptions(initializer: @AwsCdkDsl
    AnomalyDetectionMetricOptions.Builder.() -> Unit = {}): AnomalyDetectionMetricOptions =
    AnomalyDetectionMetricOptions.Builder().apply(initializer).build()
