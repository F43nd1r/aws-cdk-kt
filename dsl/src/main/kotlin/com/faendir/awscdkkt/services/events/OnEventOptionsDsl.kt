package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.OnEventOptions

@Generated
public fun onEventOptions(initializer: OnEventOptions.Builder.() -> Unit = {}): OnEventOptions =
    OnEventOptions.builder().apply(initializer).build()
