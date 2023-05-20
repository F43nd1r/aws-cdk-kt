@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

public
    fun deadLetterConfigProperty(initializer: CfnFunction.DeadLetterConfigProperty.Builder.() -> Unit):
    CfnFunction.DeadLetterConfigProperty =
    CfnFunction.DeadLetterConfigProperty.builder().apply(initializer).build()
