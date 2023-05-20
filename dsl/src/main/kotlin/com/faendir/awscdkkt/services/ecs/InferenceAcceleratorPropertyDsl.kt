@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

public
    fun inferenceAcceleratorProperty(initializer: CfnTaskDefinition.InferenceAcceleratorProperty.Builder.() -> Unit):
    CfnTaskDefinition.InferenceAcceleratorProperty =
    CfnTaskDefinition.InferenceAcceleratorProperty.builder().apply(initializer).build()
