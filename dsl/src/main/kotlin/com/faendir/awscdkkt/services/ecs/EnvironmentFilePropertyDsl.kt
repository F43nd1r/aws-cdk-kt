@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

public
    fun environmentFileProperty(initializer: CfnTaskDefinition.EnvironmentFileProperty.Builder.() -> Unit):
    CfnTaskDefinition.EnvironmentFileProperty =
    CfnTaskDefinition.EnvironmentFileProperty.builder().apply(initializer).build()
