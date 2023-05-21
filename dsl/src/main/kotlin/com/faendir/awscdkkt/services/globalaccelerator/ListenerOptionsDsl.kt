package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.ListenerOptions

@Generated
public fun listenerOptions(initializer: ListenerOptions.Builder.() -> Unit = {}): ListenerOptions =
    ListenerOptions.builder().apply(initializer).build()
