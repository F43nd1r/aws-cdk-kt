package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BuildEnvironment

@Generated
public fun buildEnvironment(initializer: BuildEnvironment.Builder.() -> Unit = {}): BuildEnvironment
    = BuildEnvironment.builder().apply(initializer).build()
