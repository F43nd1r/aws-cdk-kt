@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.BlockDevice

public fun blockDevice(initializer: BlockDevice.Builder.() -> Unit): BlockDevice =
    BlockDevice.builder().apply(initializer).build()
