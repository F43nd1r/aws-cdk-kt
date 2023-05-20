@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.VolumeFrom

public fun volumeFrom(initializer: VolumeFrom.Builder.() -> Unit): VolumeFrom =
    VolumeFrom.builder().apply(initializer).build()
