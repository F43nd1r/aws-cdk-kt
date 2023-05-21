package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FirelensOptions

@Generated
public fun firelensOptions(initializer: FirelensOptions.Builder.() -> Unit = {}): FirelensOptions =
    FirelensOptions.builder().apply(initializer).build()
