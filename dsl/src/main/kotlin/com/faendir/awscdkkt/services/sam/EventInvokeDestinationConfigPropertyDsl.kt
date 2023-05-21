package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun eventInvokeDestinationConfigProperty(initializer: CfnFunction.EventInvokeDestinationConfigProperty.Builder.() -> Unit
    = {}): CfnFunction.EventInvokeDestinationConfigProperty =
    CfnFunction.EventInvokeDestinationConfigProperty.builder().apply(initializer).build()
