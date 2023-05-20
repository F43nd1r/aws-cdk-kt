@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.greengrassv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

public
    fun lambdaEventSourceProperty(initializer: CfnComponentVersion.LambdaEventSourceProperty.Builder.() -> Unit):
    CfnComponentVersion.LambdaEventSourceProperty =
    CfnComponentVersion.LambdaEventSourceProperty.builder().apply(initializer).build()
