package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun runtimePlatformProperty(initializer: CfnTaskDefinition.RuntimePlatformProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.RuntimePlatformProperty =
    CfnTaskDefinition.RuntimePlatformProperty.builder().apply(initializer).build()
