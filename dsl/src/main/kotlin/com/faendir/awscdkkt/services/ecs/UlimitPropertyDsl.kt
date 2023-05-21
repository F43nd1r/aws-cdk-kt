package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun ulimitProperty(initializer: CfnTaskDefinition.UlimitProperty.Builder.() -> Unit = {}):
    CfnTaskDefinition.UlimitProperty =
    CfnTaskDefinition.UlimitProperty.builder().apply(initializer).build()
