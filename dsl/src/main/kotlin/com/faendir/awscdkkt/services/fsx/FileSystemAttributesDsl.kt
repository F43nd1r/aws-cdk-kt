package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.FileSystemAttributes

@Generated
public fun fileSystemAttributes(initializer: FileSystemAttributes.Builder.() -> Unit = {}):
    FileSystemAttributes = FileSystemAttributes.builder().apply(initializer).build()
