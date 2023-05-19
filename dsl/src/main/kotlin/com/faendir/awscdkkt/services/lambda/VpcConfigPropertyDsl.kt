@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

public fun vpcConfigProperty(initializer: CfnFunction.VpcConfigProperty.Builder.() -> Unit):
    CfnFunction.VpcConfigProperty =
    CfnFunction.VpcConfigProperty.builder().apply(initializer).build()
