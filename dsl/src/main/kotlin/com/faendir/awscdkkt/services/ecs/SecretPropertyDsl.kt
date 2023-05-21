package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun secretProperty(initializer: CfnTaskDefinition.SecretProperty.Builder.() -> Unit = {}):
    CfnTaskDefinition.SecretProperty =
    CfnTaskDefinition.SecretProperty.builder().apply(initializer).build()
