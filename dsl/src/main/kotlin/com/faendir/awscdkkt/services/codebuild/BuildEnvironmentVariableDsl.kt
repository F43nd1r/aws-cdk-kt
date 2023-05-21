package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable

@Generated
public fun buildEnvironmentVariable(initializer: BuildEnvironmentVariable.Builder.() -> Unit = {}):
    BuildEnvironmentVariable = BuildEnvironmentVariable.builder().apply(initializer).build()
