package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.RollingUpdateOptions

@Generated
public fun rollingUpdateOptions(initializer: RollingUpdateOptions.Builder.() -> Unit = {}):
    RollingUpdateOptions = RollingUpdateOptions.builder().apply(initializer).build()
