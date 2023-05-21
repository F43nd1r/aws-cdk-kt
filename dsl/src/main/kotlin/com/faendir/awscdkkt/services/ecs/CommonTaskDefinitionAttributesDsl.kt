package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CommonTaskDefinitionAttributes

@Generated
public
    fun commonTaskDefinitionAttributes(initializer: CommonTaskDefinitionAttributes.Builder.() -> Unit
    = {}): CommonTaskDefinitionAttributes =
    CommonTaskDefinitionAttributes.builder().apply(initializer).build()
