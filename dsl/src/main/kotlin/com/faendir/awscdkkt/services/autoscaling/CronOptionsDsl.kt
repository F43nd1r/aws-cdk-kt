package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CronOptions

@Generated
public fun cronOptions(initializer: CronOptions.Builder.() -> Unit = {}): CronOptions =
    CronOptions.builder().apply(initializer).build()
