package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

@Generated
public
    fun capacityProviderStrategyItemProperty(initializer: CfnService.CapacityProviderStrategyItemProperty.Builder.() -> Unit
    = {}): CfnService.CapacityProviderStrategyItemProperty =
    CfnService.CapacityProviderStrategyItemProperty.builder().apply(initializer).build()
