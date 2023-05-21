package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FluentdLogDriverProps

@Generated
public fun fluentdLogDriverProps(initializer: FluentdLogDriverProps.Builder.() -> Unit = {}):
    FluentdLogDriverProps = FluentdLogDriverProps.builder().apply(initializer).build()
