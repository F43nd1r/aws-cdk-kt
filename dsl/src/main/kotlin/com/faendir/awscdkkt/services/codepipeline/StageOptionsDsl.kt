@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.StageOptions

public fun stageOptions(initializer: StageOptions.Builder.() -> Unit): StageOptions =
    StageOptions.builder().apply(initializer).build()
