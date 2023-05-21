package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps

@Generated
public fun applicationListenerProps(initializer: ApplicationListenerProps.Builder.() -> Unit = {}):
    ApplicationListenerProps = ApplicationListenerProps.builder().apply(initializer).build()
