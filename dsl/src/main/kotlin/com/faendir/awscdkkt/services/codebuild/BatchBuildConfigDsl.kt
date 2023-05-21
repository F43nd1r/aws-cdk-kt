package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BatchBuildConfig

@Generated
public fun batchBuildConfig(initializer: BatchBuildConfig.Builder.() -> Unit = {}): BatchBuildConfig
    = BatchBuildConfig.builder().apply(initializer).build()
