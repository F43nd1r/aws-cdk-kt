@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CronOptions

public fun cronOptions(initializer: CronOptions.Builder.() -> Unit): CronOptions =
    CronOptions.builder().apply(initializer).build()
