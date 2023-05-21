package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FileSystemConfig

@Generated
public fun fileSystemConfig(initializer: FileSystemConfig.Builder.() -> Unit = {}): FileSystemConfig
    = FileSystemConfig.builder().apply(initializer).build()
