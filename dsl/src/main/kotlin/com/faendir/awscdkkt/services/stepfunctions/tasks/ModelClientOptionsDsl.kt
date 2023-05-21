package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions

@Generated
public fun modelClientOptions(initializer: ModelClientOptions.Builder.() -> Unit = {}):
    ModelClientOptions = ModelClientOptions.builder().apply(initializer).build()
