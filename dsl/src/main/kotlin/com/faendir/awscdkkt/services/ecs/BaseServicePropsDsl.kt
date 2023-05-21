package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.BaseServiceProps

@Generated
public fun baseServiceProps(initializer: BaseServiceProps.Builder.() -> Unit = {}): BaseServiceProps
    = BaseServiceProps.builder().apply(initializer).build()
