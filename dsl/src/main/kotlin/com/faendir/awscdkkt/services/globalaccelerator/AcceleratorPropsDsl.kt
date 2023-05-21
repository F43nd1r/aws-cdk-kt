package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.AcceleratorProps

@Generated
public fun acceleratorProps(initializer: AcceleratorProps.Builder.() -> Unit = {}): AcceleratorProps
    = AcceleratorProps.builder().apply(initializer).build()
