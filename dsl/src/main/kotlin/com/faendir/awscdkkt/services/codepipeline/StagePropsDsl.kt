package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.StageProps

@Generated
public fun stageProps(initializer: StageProps.Builder.() -> Unit = {}): StageProps =
    StageProps.builder().apply(initializer).build()
