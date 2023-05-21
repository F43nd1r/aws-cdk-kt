package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.ListenerProps

@Generated
public fun listenerProps(initializer: ListenerProps.Builder.() -> Unit = {}): ListenerProps =
    ListenerProps.builder().apply(initializer).build()
