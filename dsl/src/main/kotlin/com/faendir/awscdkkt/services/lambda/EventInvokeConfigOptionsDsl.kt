package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EventInvokeConfigOptions

@Generated
public fun eventInvokeConfigOptions(initializer: EventInvokeConfigOptions.Builder.() -> Unit = {}):
    EventInvokeConfigOptions = EventInvokeConfigOptions.builder().apply(initializer).build()
