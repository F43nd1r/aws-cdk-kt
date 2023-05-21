package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.GelfLogDriverProps

@Generated
public fun gelfLogDriverProps(initializer: GelfLogDriverProps.Builder.() -> Unit = {}):
    GelfLogDriverProps = GelfLogDriverProps.builder().apply(initializer).build()
