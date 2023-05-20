@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.ContainerOverride

public fun containerOverride(initializer: ContainerOverride.Builder.() -> Unit): ContainerOverride =
    ContainerOverride.builder().apply(initializer).build()
