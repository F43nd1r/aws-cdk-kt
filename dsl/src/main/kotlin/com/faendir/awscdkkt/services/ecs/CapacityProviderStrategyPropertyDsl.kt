package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations

@Generated
public
    fun capacityProviderStrategyProperty(initializer: CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty.Builder.() -> Unit
    = {}): CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty =
    CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty.builder().apply(initializer).build()
