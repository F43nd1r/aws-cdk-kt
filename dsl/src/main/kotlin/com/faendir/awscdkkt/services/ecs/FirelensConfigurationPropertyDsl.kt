package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun firelensConfigurationProperty(initializer: CfnTaskDefinition.FirelensConfigurationProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.FirelensConfigurationProperty =
    CfnTaskDefinition.FirelensConfigurationProperty.builder().apply(initializer).build()
