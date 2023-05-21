package com.faendir.awscdkkt.services.rum

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor

@Generated
public fun customEventsProperty(initializer: CfnAppMonitor.CustomEventsProperty.Builder.() -> Unit =
    {}): CfnAppMonitor.CustomEventsProperty =
    CfnAppMonitor.CustomEventsProperty.builder().apply(initializer).build()
