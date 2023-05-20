@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.MountPoint

public fun mountPoint(initializer: MountPoint.Builder.() -> Unit): MountPoint =
    MountPoint.builder().apply(initializer).build()
