package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes

@Generated
public fun acceleratorAttributes(initializer: AcceleratorAttributes.Builder.() -> Unit = {}):
    AcceleratorAttributes = AcceleratorAttributes.builder().apply(initializer).build()
