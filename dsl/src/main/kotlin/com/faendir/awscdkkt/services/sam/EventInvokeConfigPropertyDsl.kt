@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

public
    fun eventInvokeConfigProperty(initializer: CfnFunction.EventInvokeConfigProperty.Builder.() -> Unit):
    CfnFunction.EventInvokeConfigProperty =
    CfnFunction.EventInvokeConfigProperty.builder().apply(initializer).build()
