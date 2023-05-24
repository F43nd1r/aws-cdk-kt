package com.faendir.awscdkkt.generated.services.applicationautoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@Generated
public fun buildPredefinedMetricSpecificationProperty(initializer: @AwsCdkDsl
    CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.() -> Unit):
    CfnScalingPolicy.PredefinedMetricSpecificationProperty =
    CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder().apply(initializer).build()
