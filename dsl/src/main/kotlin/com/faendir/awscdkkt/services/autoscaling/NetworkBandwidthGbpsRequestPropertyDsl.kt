package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun networkBandwidthGbpsRequestProperty(initializer: CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty =
    CfnAutoScalingGroup.NetworkBandwidthGbpsRequestProperty.builder().apply(initializer).build()
