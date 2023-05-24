package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public fun buildMetricProperty(initializer: @AwsCdkDsl
    CfnScalingPolicy.MetricProperty.Builder.() -> Unit): CfnScalingPolicy.MetricProperty =
    CfnScalingPolicy.MetricProperty.Builder().apply(initializer).build()
