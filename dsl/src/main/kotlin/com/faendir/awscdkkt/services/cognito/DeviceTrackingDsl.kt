package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.DeviceTracking

@Generated
public fun deviceTracking(initializer: DeviceTracking.Builder.() -> Unit = {}): DeviceTracking =
    DeviceTracking.builder().apply(initializer).build()
