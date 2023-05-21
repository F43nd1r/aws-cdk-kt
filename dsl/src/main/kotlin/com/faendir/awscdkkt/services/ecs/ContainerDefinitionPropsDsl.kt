package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ContainerDefinitionProps

@Generated
public fun containerDefinitionProps(initializer: ContainerDefinitionProps.Builder.() -> Unit = {}):
    ContainerDefinitionProps = ContainerDefinitionProps.builder().apply(initializer).build()
