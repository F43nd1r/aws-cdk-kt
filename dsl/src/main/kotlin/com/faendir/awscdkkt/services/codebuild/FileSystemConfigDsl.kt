package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.FileSystemConfig

@Generated
public fun fileSystemConfig(initializer: FileSystemConfig.Builder.() -> Unit = {}): FileSystemConfig
    = FileSystemConfig.builder().apply(initializer).build()
