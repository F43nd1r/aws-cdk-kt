package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

@Generated
public fun environmentProperty(initializer: CfnFunction.EnvironmentProperty.Builder.() -> Unit =
    {}): CfnFunction.EnvironmentProperty =
    CfnFunction.EnvironmentProperty.builder().apply(initializer).build()
