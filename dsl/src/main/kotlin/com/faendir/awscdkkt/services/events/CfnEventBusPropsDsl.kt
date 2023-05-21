package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEventBusProps

@Generated
public fun cfnEventBusProps(initializer: CfnEventBusProps.Builder.() -> Unit = {}): CfnEventBusProps
    = CfnEventBusProps.builder().apply(initializer).build()
