@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnFunction

public
    fun functionConfigProperty(initializer: CfnFunction.FunctionConfigProperty.Builder.() -> Unit):
    CfnFunction.FunctionConfigProperty =
    CfnFunction.FunctionConfigProperty.builder().apply(initializer).build()
