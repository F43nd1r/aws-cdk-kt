package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.PortRange

@Generated
public fun portRange(initializer: PortRange.Builder.() -> Unit = {}): PortRange =
    PortRange.builder().apply(initializer).build()
