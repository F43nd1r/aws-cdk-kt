package com.faendir.awscdkkt.triggers

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.triggers.TriggerProps

@Generated
public fun triggerProps(initializer: TriggerProps.Builder.() -> Unit = {}): TriggerProps =
    TriggerProps.builder().apply(initializer).build()
