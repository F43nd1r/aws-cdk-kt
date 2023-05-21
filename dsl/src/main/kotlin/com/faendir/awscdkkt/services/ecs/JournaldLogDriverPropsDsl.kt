package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.JournaldLogDriverProps

@Generated
public fun journaldLogDriverProps(initializer: JournaldLogDriverProps.Builder.() -> Unit = {}):
    JournaldLogDriverProps = JournaldLogDriverProps.builder().apply(initializer).build()
