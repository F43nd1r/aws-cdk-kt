package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBusPolicyProps

@Generated
public fun eventBusPolicyProps(initializer: EventBusPolicyProps.Builder.() -> Unit = {}):
    EventBusPolicyProps = EventBusPolicyProps.builder().apply(initializer).build()
