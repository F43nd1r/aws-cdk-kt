package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@Generated
public fun buildPredictiveScalingMetricSpecificationProperty(initializer: @AwsCdkDsl
    CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder.() -> Unit = {}):
    CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty =
    CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder().apply(initializer).build()
