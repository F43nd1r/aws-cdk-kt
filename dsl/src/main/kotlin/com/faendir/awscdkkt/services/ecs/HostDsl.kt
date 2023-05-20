@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Host

public fun host(initializer: Host.Builder.() -> Unit): Host =
    Host.builder().apply(initializer).build()
