package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun instancesDistributionProperty(initializer: CfnAutoScalingGroup.InstancesDistributionProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.InstancesDistributionProperty =
    CfnAutoScalingGroup.InstancesDistributionProperty.builder().apply(initializer).build()
