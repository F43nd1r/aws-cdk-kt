package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VolumeProps

@Generated
public fun volumeProps(initializer: VolumeProps.Builder.() -> Unit = {}): VolumeProps =
    VolumeProps.builder().apply(initializer).build()
