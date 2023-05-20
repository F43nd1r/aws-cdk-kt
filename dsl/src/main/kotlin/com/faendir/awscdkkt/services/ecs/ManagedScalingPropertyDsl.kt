@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCapacityProvider

public
    fun managedScalingProperty(initializer: CfnCapacityProvider.ManagedScalingProperty.Builder.() -> Unit):
    CfnCapacityProvider.ManagedScalingProperty =
    CfnCapacityProvider.ManagedScalingProperty.builder().apply(initializer).build()
