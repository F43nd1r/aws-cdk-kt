package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun functionEnvironmentProperty(initializer: CfnFunction.FunctionEnvironmentProperty.Builder.() -> Unit
    = {}): CfnFunction.FunctionEnvironmentProperty =
    CfnFunction.FunctionEnvironmentProperty.builder().apply(initializer).build()
