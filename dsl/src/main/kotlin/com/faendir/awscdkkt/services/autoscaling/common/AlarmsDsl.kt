package com.faendir.awscdkkt.services.autoscaling.common

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.common.Alarms

@Generated
public fun alarms(initializer: Alarms.Builder.() -> Unit = {}): Alarms =
    Alarms.builder().apply(initializer).build()
