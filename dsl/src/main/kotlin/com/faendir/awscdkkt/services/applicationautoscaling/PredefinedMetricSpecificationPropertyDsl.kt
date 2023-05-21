package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@Generated
public
    fun predefinedMetricSpecificationProperty(initializer: CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.PredefinedMetricSpecificationProperty =
    CfnScalingPolicy.PredefinedMetricSpecificationProperty.builder().apply(initializer).build()
