@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FileSystemConfig

public fun fileSystemConfig(initializer: FileSystemConfig.Builder.() -> Unit): FileSystemConfig =
    FileSystemConfig.builder().apply(initializer).build()
