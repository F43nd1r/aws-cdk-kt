package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskProps

@Generated
public fun ecsRunTaskProps(initializer: EcsRunTaskProps.Builder.() -> Unit = {}): EcsRunTaskProps =
    EcsRunTaskProps.builder().apply(initializer).build()
