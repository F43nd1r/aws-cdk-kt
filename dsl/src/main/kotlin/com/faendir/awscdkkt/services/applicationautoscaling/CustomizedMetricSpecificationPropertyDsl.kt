@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

public
    fun customizedMetricSpecificationProperty(initializer: CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder.() -> Unit):
    CfnScalingPolicy.CustomizedMetricSpecificationProperty =
    CfnScalingPolicy.CustomizedMetricSpecificationProperty.builder().apply(initializer).build()
