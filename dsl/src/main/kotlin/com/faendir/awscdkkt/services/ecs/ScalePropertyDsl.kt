package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet

@Generated
public fun scaleProperty(initializer: CfnTaskSet.ScaleProperty.Builder.() -> Unit = {}):
    CfnTaskSet.ScaleProperty = CfnTaskSet.ScaleProperty.builder().apply(initializer).build()
