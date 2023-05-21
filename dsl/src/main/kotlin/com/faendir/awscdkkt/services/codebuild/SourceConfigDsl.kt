package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.SourceConfig

@Generated
public fun sourceConfig(initializer: SourceConfig.Builder.() -> Unit = {}): SourceConfig =
    SourceConfig.builder().apply(initializer).build()
