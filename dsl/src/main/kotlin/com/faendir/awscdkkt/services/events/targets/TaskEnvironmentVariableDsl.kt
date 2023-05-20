@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable

public fun taskEnvironmentVariable(initializer: TaskEnvironmentVariable.Builder.() -> Unit):
    TaskEnvironmentVariable = TaskEnvironmentVariable.builder().apply(initializer).build()
