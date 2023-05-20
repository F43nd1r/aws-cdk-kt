@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.PortOverride

public fun portOverride(initializer: PortOverride.Builder.() -> Unit): PortOverride =
    PortOverride.builder().apply(initializer).build()
