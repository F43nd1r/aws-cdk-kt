package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun inferenceAcceleratorProperty(initializer: CfnTaskDefinition.InferenceAcceleratorProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.InferenceAcceleratorProperty =
    CfnTaskDefinition.InferenceAcceleratorProperty.builder().apply(initializer).build()
