package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.TransformInput

@Generated
public fun transformInput(initializer: TransformInput.Builder.() -> Unit = {}): TransformInput =
    TransformInput.builder().apply(initializer).build()
