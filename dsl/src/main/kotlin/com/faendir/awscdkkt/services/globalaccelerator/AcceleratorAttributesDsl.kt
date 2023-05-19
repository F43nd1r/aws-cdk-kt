@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes

public fun acceleratorAttributes(initializer: AcceleratorAttributes.Builder.() -> Unit):
    AcceleratorAttributes = AcceleratorAttributes.builder().apply(initializer).build()
