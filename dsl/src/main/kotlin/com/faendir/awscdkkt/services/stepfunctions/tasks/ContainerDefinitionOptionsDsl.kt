package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions

@Generated
public fun containerDefinitionOptions(initializer: ContainerDefinitionOptions.Builder.() -> Unit =
    {}): ContainerDefinitionOptions =
    ContainerDefinitionOptions.builder().apply(initializer).build()
