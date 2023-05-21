package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun tmpfsProperty(initializer: CfnTaskDefinition.TmpfsProperty.Builder.() -> Unit = {}):
    CfnTaskDefinition.TmpfsProperty =
    CfnTaskDefinition.TmpfsProperty.builder().apply(initializer).build()
