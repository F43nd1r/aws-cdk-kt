package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogStreamProps

@Generated
public fun logStreamProps(initializer: LogStreamProps.Builder.() -> Unit = {}): LogStreamProps =
    LogStreamProps.builder().apply(initializer).build()
