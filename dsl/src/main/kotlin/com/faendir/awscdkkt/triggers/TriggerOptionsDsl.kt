package com.faendir.awscdkkt.triggers

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.triggers.TriggerOptions

@Generated
public fun triggerOptions(initializer: TriggerOptions.Builder.() -> Unit = {}): TriggerOptions =
    TriggerOptions.builder().apply(initializer).build()
