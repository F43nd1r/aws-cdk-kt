package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSetProps

@Generated
public fun cfnTaskSetProps(initializer: CfnTaskSetProps.Builder.() -> Unit = {}): CfnTaskSetProps =
    CfnTaskSetProps.builder().apply(initializer).build()
