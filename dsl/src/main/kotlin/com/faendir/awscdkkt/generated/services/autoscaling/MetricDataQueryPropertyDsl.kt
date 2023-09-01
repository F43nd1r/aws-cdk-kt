package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public fun buildMetricDataQueryProperty(initializer: @AwsCdkDsl
    CfnScalingPolicy.MetricDataQueryProperty.Builder.() -> Unit = {}):
    CfnScalingPolicy.MetricDataQueryProperty =
    CfnScalingPolicy.MetricDataQueryProperty.Builder().apply(initializer).build()
