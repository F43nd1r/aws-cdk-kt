package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ContainerDefinitionOptions

@Generated
public fun containerDefinitionOptions(initializer: ContainerDefinitionOptions.Builder.() -> Unit =
    {}): ContainerDefinitionOptions =
    ContainerDefinitionOptions.builder().apply(initializer).build()
