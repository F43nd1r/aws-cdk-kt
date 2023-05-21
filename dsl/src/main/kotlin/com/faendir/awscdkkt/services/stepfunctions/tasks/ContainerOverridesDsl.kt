package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides

@Generated
public fun containerOverrides(initializer: ContainerOverrides.Builder.() -> Unit = {}):
    ContainerOverrides = ContainerOverrides.builder().apply(initializer).build()
