@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

public
    fun httpApiFunctionAuthProperty(initializer: CfnFunction.HttpApiFunctionAuthProperty.Builder.() -> Unit):
    CfnFunction.HttpApiFunctionAuthProperty =
    CfnFunction.HttpApiFunctionAuthProperty.builder().apply(initializer).build()
