package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCapacityProvider

@Generated
public
    fun autoScalingGroupProviderProperty(initializer: CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder.() -> Unit
    = {}): CfnCapacityProvider.AutoScalingGroupProviderProperty =
    CfnCapacityProvider.AutoScalingGroupProviderProperty.builder().apply(initializer).build()
