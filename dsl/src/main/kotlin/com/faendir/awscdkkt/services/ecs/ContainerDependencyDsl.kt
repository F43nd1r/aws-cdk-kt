package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ContainerDependency

@Generated
public fun containerDependency(initializer: ContainerDependency.Builder.() -> Unit = {}):
    ContainerDependency = ContainerDependency.builder().apply(initializer).build()
