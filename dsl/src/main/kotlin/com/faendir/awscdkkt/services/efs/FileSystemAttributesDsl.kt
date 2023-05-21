package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.FileSystemAttributes

@Generated
public fun fileSystemAttributes(initializer: FileSystemAttributes.Builder.() -> Unit = {}):
    FileSystemAttributes = FileSystemAttributes.builder().apply(initializer).build()
