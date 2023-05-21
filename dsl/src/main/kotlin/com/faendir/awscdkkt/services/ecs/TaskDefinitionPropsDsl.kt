package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.TaskDefinitionProps

@Generated
public fun taskDefinitionProps(initializer: TaskDefinitionProps.Builder.() -> Unit = {}):
    TaskDefinitionProps = TaskDefinitionProps.builder().apply(initializer).build()
