@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.FileSystemAttributes

public fun fileSystemAttributes(initializer: FileSystemAttributes.Builder.() -> Unit):
    FileSystemAttributes = FileSystemAttributes.builder().apply(initializer).build()
