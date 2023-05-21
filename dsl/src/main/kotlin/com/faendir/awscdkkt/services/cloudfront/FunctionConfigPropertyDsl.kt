package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnFunction

@Generated
public fun functionConfigProperty(initializer: CfnFunction.FunctionConfigProperty.Builder.() -> Unit
    = {}): CfnFunction.FunctionConfigProperty =
    CfnFunction.FunctionConfigProperty.builder().apply(initializer).build()
