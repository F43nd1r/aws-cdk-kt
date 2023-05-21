package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun baselineEbsBandwidthMbpsRequestProperty(initializer: CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty =
    CfnAutoScalingGroup.BaselineEbsBandwidthMbpsRequestProperty.builder().apply(initializer).build()
