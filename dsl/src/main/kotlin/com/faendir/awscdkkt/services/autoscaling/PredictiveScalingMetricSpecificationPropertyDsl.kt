@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

public
    fun predictiveScalingMetricSpecificationProperty(initializer: CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder.() -> Unit):
    CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty =
    CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.builder().apply(initializer).build()
