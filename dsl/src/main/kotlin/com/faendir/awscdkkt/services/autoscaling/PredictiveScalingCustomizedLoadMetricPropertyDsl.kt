@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

public
    fun predictiveScalingCustomizedLoadMetricProperty(initializer: CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty.Builder.() -> Unit):
    CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty =
    CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty.builder().apply(initializer).build()
