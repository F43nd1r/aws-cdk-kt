@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCapacityProvider

public
    fun autoScalingGroupProviderProperty(initializer: CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder.() -> Unit):
    CfnCapacityProvider.AutoScalingGroupProviderProperty =
    CfnCapacityProvider.AutoScalingGroupProviderProperty.builder().apply(initializer).build()
