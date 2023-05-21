package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.ActionConfig

@Generated
public fun actionConfig(initializer: ActionConfig.Builder.() -> Unit = {}): ActionConfig =
    ActionConfig.builder().apply(initializer).build()
