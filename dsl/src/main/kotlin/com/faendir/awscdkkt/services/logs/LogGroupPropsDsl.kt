package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogGroupProps

@Generated
public fun logGroupProps(initializer: LogGroupProps.Builder.() -> Unit = {}): LogGroupProps =
    LogGroupProps.builder().apply(initializer).build()
