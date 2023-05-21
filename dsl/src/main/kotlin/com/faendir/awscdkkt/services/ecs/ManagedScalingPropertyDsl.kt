package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCapacityProvider

@Generated
public
    fun managedScalingProperty(initializer: CfnCapacityProvider.ManagedScalingProperty.Builder.() -> Unit
    = {}): CfnCapacityProvider.ManagedScalingProperty =
    CfnCapacityProvider.ManagedScalingProperty.builder().apply(initializer).build()
