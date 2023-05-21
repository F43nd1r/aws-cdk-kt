package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.ConnectionProps

@Generated
public fun connectionProps(initializer: ConnectionProps.Builder.() -> Unit = {}): ConnectionProps =
    ConnectionProps.builder().apply(initializer).build()
