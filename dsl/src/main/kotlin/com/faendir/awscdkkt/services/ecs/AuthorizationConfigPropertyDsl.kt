@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

public
    fun authorizationConfigProperty(initializer: CfnTaskDefinition.AuthorizationConfigProperty.Builder.() -> Unit):
    CfnTaskDefinition.AuthorizationConfigProperty =
    CfnTaskDefinition.AuthorizationConfigProperty.builder().apply(initializer).build()
