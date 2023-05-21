package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@Generated
public
    fun stageTransitionProperty(initializer: CfnPipeline.StageTransitionProperty.Builder.() -> Unit
    = {}): CfnPipeline.StageTransitionProperty =
    CfnPipeline.StageTransitionProperty.builder().apply(initializer).build()
