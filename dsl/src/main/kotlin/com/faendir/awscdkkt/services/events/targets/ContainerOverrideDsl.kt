@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.ContainerOverride

public fun containerOverride(initializer: ContainerOverride.Builder.() -> Unit): ContainerOverride =
    ContainerOverride.builder().apply(initializer).build()
