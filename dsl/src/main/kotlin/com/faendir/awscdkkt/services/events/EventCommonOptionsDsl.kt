package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.EventCommonOptions

@Generated
public fun eventCommonOptions(initializer: EventCommonOptions.Builder.() -> Unit = {}):
    EventCommonOptions = EventCommonOptions.builder().apply(initializer).build()
