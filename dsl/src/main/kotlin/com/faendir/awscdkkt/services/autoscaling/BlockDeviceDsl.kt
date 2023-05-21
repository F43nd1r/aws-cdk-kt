package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.BlockDevice

@Generated
public fun blockDevice(initializer: BlockDevice.Builder.() -> Unit = {}): BlockDevice =
    BlockDevice.builder().apply(initializer).build()
