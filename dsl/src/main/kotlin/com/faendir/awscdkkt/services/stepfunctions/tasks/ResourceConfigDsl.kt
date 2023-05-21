package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig

@Generated
public fun resourceConfig(initializer: ResourceConfig.Builder.() -> Unit = {}): ResourceConfig =
    ResourceConfig.builder().apply(initializer).build()
