@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CronOptions

public fun cronOptions(initializer: CronOptions.Builder.() -> Unit): CronOptions =
    CronOptions.builder().apply(initializer).build()
