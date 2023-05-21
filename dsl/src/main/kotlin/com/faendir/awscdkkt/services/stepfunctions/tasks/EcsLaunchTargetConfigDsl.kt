package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig

@Generated
public fun ecsLaunchTargetConfig(initializer: EcsLaunchTargetConfig.Builder.() -> Unit = {}):
    EcsLaunchTargetConfig = EcsLaunchTargetConfig.builder().apply(initializer).build()
