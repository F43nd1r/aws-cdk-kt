package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VolumeAttributes

@Generated
public fun volumeAttributes(initializer: VolumeAttributes.Builder.() -> Unit = {}): VolumeAttributes
    = VolumeAttributes.builder().apply(initializer).build()
