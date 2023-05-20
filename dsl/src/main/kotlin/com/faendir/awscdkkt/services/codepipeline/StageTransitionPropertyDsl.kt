@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnPipeline

public
    fun stageTransitionProperty(initializer: CfnPipeline.StageTransitionProperty.Builder.() -> Unit):
    CfnPipeline.StageTransitionProperty =
    CfnPipeline.StageTransitionProperty.builder().apply(initializer).build()
