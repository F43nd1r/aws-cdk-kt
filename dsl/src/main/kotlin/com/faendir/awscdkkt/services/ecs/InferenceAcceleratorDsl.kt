package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.InferenceAccelerator

@Generated
public fun inferenceAccelerator(initializer: InferenceAccelerator.Builder.() -> Unit = {}):
    InferenceAccelerator = InferenceAccelerator.builder().apply(initializer).build()
