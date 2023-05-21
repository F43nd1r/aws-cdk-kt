package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.StagePlacement

@Generated
public fun stagePlacement(initializer: StagePlacement.Builder.() -> Unit = {}): StagePlacement =
    StagePlacement.builder().apply(initializer).build()
