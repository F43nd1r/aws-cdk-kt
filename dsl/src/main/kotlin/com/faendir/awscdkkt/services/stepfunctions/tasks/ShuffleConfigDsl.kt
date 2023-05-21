package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig

@Generated
public fun shuffleConfig(initializer: ShuffleConfig.Builder.() -> Unit = {}): ShuffleConfig =
    ShuffleConfig.builder().apply(initializer).build()
