package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.PortOverride

@Generated
public fun portOverride(initializer: PortOverride.Builder.() -> Unit = {}): PortOverride =
    PortOverride.builder().apply(initializer).build()
