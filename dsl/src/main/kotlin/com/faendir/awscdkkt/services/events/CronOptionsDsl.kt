package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CronOptions

@Generated
public fun cronOptions(initializer: CronOptions.Builder.() -> Unit = {}): CronOptions =
    CronOptions.builder().apply(initializer).build()
