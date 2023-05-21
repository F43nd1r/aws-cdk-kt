package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.CfnListener

@Generated
public fun portRangeProperty(initializer: CfnListener.PortRangeProperty.Builder.() -> Unit = {}):
    CfnListener.PortRangeProperty =
    CfnListener.PortRangeProperty.builder().apply(initializer).build()
