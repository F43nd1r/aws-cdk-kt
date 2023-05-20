@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnPipeline

public
    fun stageTransitionProperty(initializer: CfnPipeline.StageTransitionProperty.Builder.() -> Unit):
    CfnPipeline.StageTransitionProperty =
    CfnPipeline.StageTransitionProperty.builder().apply(initializer).build()
