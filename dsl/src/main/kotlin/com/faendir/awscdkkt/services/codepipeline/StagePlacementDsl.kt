@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.StagePlacement

public fun stagePlacement(initializer: StagePlacement.Builder.() -> Unit): StagePlacement =
    StagePlacement.builder().apply(initializer).build()
