package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.LogGroupProps

@Generated
public fun logGroupProps(initializer: LogGroupProps.Builder.() -> Unit = {}): LogGroupProps =
    LogGroupProps.builder().apply(initializer).build()
