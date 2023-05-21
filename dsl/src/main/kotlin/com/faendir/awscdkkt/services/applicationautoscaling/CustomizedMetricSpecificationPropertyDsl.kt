package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@Generated
public
    fun customizedMetricSpecificationProperty(initializer: CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.CustomizedMetricSpecificationProperty =
    CfnScalingPolicy.CustomizedMetricSpecificationProperty.builder().apply(initializer).build()
