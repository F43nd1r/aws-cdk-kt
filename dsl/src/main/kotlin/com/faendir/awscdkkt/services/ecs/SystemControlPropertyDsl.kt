@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

public
    fun systemControlProperty(initializer: CfnTaskDefinition.SystemControlProperty.Builder.() -> Unit):
    CfnTaskDefinition.SystemControlProperty =
    CfnTaskDefinition.SystemControlProperty.builder().apply(initializer).build()
