@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

public fun tracingConfigProperty(initializer: CfnFunction.TracingConfigProperty.Builder.() -> Unit):
    CfnFunction.TracingConfigProperty =
    CfnFunction.TracingConfigProperty.builder().apply(initializer).build()
