@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionAttributes

public
    fun fargateTaskDefinitionAttributes(initializer: FargateTaskDefinitionAttributes.Builder.() -> Unit):
    FargateTaskDefinitionAttributes =
    FargateTaskDefinitionAttributes.builder().apply(initializer).build()
