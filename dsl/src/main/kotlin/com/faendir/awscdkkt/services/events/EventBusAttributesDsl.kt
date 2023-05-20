@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBusAttributes

public fun eventBusAttributes(initializer: EventBusAttributes.Builder.() -> Unit):
    EventBusAttributes = EventBusAttributes.builder().apply(initializer).build()
