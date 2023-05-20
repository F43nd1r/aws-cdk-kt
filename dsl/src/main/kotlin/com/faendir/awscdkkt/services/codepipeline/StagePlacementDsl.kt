@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.StagePlacement

public fun stagePlacement(initializer: StagePlacement.Builder.() -> Unit): StagePlacement =
    StagePlacement.builder().apply(initializer).build()
