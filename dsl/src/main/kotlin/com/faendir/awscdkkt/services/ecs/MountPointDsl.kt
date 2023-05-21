package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.MountPoint

@Generated
public fun mountPoint(initializer: MountPoint.Builder.() -> Unit = {}): MountPoint =
    MountPoint.builder().apply(initializer).build()
