@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Volume

public fun volume(initializer: Volume.Builder.() -> Unit): Volume =
    Volume.builder().apply(initializer).build()
