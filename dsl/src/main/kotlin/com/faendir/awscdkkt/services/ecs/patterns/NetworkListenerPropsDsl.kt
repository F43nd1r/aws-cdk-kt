package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps

@Generated
public fun networkListenerProps(initializer: NetworkListenerProps.Builder.() -> Unit = {}):
    NetworkListenerProps = NetworkListenerProps.builder().apply(initializer).build()
