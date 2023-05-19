@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.EventBusProps

public fun eventBusProps(initializer: EventBusProps.Builder.() -> Unit): EventBusProps =
    EventBusProps.builder().apply(initializer).build()
