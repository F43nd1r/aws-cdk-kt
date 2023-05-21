package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable

@Generated
public fun taskEnvironmentVariable(initializer: TaskEnvironmentVariable.Builder.() -> Unit = {}):
    TaskEnvironmentVariable = TaskEnvironmentVariable.builder().apply(initializer).build()
