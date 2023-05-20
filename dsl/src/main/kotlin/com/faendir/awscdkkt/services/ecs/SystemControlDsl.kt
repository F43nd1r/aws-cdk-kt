@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.SystemControl

public fun systemControl(initializer: SystemControl.Builder.() -> Unit): SystemControl =
    SystemControl.builder().apply(initializer).build()
