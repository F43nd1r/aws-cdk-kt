package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionAttributes

@Generated
public
    fun fargateTaskDefinitionAttributes(initializer: FargateTaskDefinitionAttributes.Builder.() -> Unit
    = {}): FargateTaskDefinitionAttributes =
    FargateTaskDefinitionAttributes.builder().apply(initializer).build()
