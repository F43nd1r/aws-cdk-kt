package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

@Generated
public fun imageConfigProperty(initializer: CfnFunction.ImageConfigProperty.Builder.() -> Unit =
    {}): CfnFunction.ImageConfigProperty =
    CfnFunction.ImageConfigProperty.builder().apply(initializer).build()
