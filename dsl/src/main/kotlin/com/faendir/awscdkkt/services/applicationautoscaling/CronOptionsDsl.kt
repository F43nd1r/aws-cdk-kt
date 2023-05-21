package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CronOptions

@Generated
public fun cronOptions(initializer: CronOptions.Builder.() -> Unit = {}): CronOptions =
    CronOptions.builder().apply(initializer).build()
