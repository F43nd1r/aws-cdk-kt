package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.TaskDefinitionAttributes

@Generated
public fun taskDefinitionAttributes(initializer: TaskDefinitionAttributes.Builder.() -> Unit = {}):
    TaskDefinitionAttributes = TaskDefinitionAttributes.builder().apply(initializer).build()
