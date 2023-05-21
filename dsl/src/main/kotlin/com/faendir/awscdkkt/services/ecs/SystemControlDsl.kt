package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.SystemControl

@Generated
public fun systemControl(initializer: SystemControl.Builder.() -> Unit = {}): SystemControl =
    SystemControl.builder().apply(initializer).build()
