package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun authorizationConfigProperty(initializer: CfnJobDefinition.AuthorizationConfigProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.AuthorizationConfigProperty =
    CfnJobDefinition.AuthorizationConfigProperty.builder().apply(initializer).build()
