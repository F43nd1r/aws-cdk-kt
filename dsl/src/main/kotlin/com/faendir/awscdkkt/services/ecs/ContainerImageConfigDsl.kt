package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ContainerImageConfig

@Generated
public fun containerImageConfig(initializer: ContainerImageConfig.Builder.() -> Unit = {}):
    ContainerImageConfig = ContainerImageConfig.builder().apply(initializer).build()
