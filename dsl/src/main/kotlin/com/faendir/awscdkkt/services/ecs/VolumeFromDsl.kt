@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.VolumeFrom

public fun volumeFrom(initializer: VolumeFrom.Builder.() -> Unit): VolumeFrom =
    VolumeFrom.builder().apply(initializer).build()
