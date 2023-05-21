package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

@Generated
public
    fun deadLetterConfigProperty(initializer: CfnFunction.DeadLetterConfigProperty.Builder.() -> Unit
    = {}): CfnFunction.DeadLetterConfigProperty =
    CfnFunction.DeadLetterConfigProperty.builder().apply(initializer).build()
