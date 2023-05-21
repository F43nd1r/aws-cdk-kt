package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BuildImageConfig

@Generated
public fun buildImageConfig(initializer: BuildImageConfig.Builder.() -> Unit = {}): BuildImageConfig
    = BuildImageConfig.builder().apply(initializer).build()
