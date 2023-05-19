@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.PortRange

public fun portRange(initializer: PortRange.Builder.() -> Unit): PortRange =
    PortRange.builder().apply(initializer).build()
