@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

public
    fun runtimeManagementConfigProperty(initializer: CfnFunction.RuntimeManagementConfigProperty.Builder.() -> Unit):
    CfnFunction.RuntimeManagementConfigProperty =
    CfnFunction.RuntimeManagementConfigProperty.builder().apply(initializer).build()
