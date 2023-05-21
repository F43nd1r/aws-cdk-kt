package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig

@Generated
public fun outputDataConfig(initializer: OutputDataConfig.Builder.() -> Unit = {}): OutputDataConfig
    = OutputDataConfig.builder().apply(initializer).build()
