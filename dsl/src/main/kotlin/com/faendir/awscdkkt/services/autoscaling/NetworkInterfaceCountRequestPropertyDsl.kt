package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun networkInterfaceCountRequestProperty(initializer: CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty =
    CfnAutoScalingGroup.NetworkInterfaceCountRequestProperty.builder().apply(initializer).build()
