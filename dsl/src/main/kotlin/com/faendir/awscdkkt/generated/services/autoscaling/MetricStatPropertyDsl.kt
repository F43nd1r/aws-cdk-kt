package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public fun buildMetricStatProperty(initializer: @AwsCdkDsl
    CfnScalingPolicy.MetricStatProperty.Builder.() -> Unit): CfnScalingPolicy.MetricStatProperty =
    CfnScalingPolicy.MetricStatProperty.Builder().apply(initializer).build()
