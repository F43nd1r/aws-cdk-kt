package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun environmentFileProperty(initializer: CfnTaskDefinition.EnvironmentFileProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.EnvironmentFileProperty =
    CfnTaskDefinition.EnvironmentFileProperty.builder().apply(initializer).build()
