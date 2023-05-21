package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.BaseServiceOptions

@Generated
public fun baseServiceOptions(initializer: BaseServiceOptions.Builder.() -> Unit = {}):
    BaseServiceOptions = BaseServiceOptions.builder().apply(initializer).build()
