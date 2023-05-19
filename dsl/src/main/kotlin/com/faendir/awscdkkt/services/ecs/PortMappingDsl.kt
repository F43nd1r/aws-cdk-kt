@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.PortMapping

public fun portMapping(initializer: PortMapping.Builder.() -> Unit): PortMapping =
    PortMapping.builder().apply(initializer).build()
