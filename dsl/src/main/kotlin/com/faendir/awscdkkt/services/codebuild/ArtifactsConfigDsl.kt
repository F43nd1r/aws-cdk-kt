package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.ArtifactsConfig

@Generated
public fun artifactsConfig(initializer: ArtifactsConfig.Builder.() -> Unit = {}): ArtifactsConfig =
    ArtifactsConfig.builder().apply(initializer).build()
