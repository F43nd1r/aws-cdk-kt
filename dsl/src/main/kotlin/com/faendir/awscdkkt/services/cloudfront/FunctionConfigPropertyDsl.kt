@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnFunction

public
    fun functionConfigProperty(initializer: CfnFunction.FunctionConfigProperty.Builder.() -> Unit):
    CfnFunction.FunctionConfigProperty =
    CfnFunction.FunctionConfigProperty.builder().apply(initializer).build()
