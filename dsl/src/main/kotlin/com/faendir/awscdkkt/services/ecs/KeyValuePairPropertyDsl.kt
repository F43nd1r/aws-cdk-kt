package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun keyValuePairProperty(initializer: CfnTaskDefinition.KeyValuePairProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.KeyValuePairProperty =
    CfnTaskDefinition.KeyValuePairProperty.builder().apply(initializer).build()
