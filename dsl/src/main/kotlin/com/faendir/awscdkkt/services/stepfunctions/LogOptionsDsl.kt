package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.LogOptions

@Generated
public fun logOptions(initializer: LogOptions.Builder.() -> Unit = {}): LogOptions =
    LogOptions.builder().apply(initializer).build()
