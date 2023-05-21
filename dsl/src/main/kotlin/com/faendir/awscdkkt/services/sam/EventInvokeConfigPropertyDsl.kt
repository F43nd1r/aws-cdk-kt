package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun eventInvokeConfigProperty(initializer: CfnFunction.EventInvokeConfigProperty.Builder.() -> Unit
    = {}): CfnFunction.EventInvokeConfigProperty =
    CfnFunction.EventInvokeConfigProperty.builder().apply(initializer).build()
