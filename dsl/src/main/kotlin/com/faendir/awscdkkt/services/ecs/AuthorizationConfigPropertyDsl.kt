package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public
    fun authorizationConfigProperty(initializer: CfnTaskDefinition.AuthorizationConfigProperty.Builder.() -> Unit
    = {}): CfnTaskDefinition.AuthorizationConfigProperty =
    CfnTaskDefinition.AuthorizationConfigProperty.builder().apply(initializer).build()
