package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun logConfigurationProperty(initializer: CfnTaskDefinition.LogConfigurationProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.LogConfigurationProperty =
    CfnTaskDefinition.LogConfigurationProperty.builder().apply(initializer).build()
