package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.BlockDevice

@Generated
public fun blockDevice(initializer: BlockDevice.Builder.() -> Unit = {}): BlockDevice =
    BlockDevice.builder().apply(initializer).build()
