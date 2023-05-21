package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@Generated
public
    fun customizedMetricSpecificationProperty(initializer: CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.() -> Unit
    = {}): CfnScalingPolicy.CustomizedMetricSpecificationProperty =
    CfnScalingPolicy.CustomizedMetricSpecificationProperty.builder().apply(initializer).build()
