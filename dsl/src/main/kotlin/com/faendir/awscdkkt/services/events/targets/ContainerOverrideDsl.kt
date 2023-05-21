package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.ContainerOverride

@Generated
public fun containerOverride(initializer: ContainerOverride.Builder.() -> Unit = {}):
    ContainerOverride = ContainerOverride.builder().apply(initializer).build()
