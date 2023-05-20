@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.PortRange

public fun portRange(initializer: PortRange.Builder.() -> Unit): PortRange =
    PortRange.builder().apply(initializer).build()
