package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput

@Generated
public fun transformOutput(initializer: TransformOutput.Builder.() -> Unit = {}): TransformOutput =
    TransformOutput.builder().apply(initializer).build()
