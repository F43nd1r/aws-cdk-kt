package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun portMappingProperty(initializer: CfnTaskDefinition.PortMappingProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.PortMappingProperty =
    CfnTaskDefinition.PortMappingProperty.builder().apply(initializer).build()
