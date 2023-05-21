package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExternalTaskDefinitionProps

@Generated
public fun externalTaskDefinitionProps(initializer: ExternalTaskDefinitionProps.Builder.() -> Unit =
    {}): ExternalTaskDefinitionProps =
    ExternalTaskDefinitionProps.builder().apply(initializer).build()
