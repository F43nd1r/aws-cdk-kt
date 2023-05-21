package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes

@Generated
public
    fun externalTaskDefinitionAttributes(initializer: ExternalTaskDefinitionAttributes.Builder.() -> Unit
    = {}): ExternalTaskDefinitionAttributes =
    ExternalTaskDefinitionAttributes.builder().apply(initializer).build()
