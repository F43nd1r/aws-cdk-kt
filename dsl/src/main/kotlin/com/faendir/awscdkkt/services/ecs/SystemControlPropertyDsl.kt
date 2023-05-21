package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun systemControlProperty(initializer: CfnTaskDefinition.SystemControlProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.SystemControlProperty =
    CfnTaskDefinition.SystemControlProperty.builder().apply(initializer).build()
