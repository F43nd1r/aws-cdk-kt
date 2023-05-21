package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.FileSystemProps

@Generated
public fun fileSystemProps(initializer: FileSystemProps.Builder.() -> Unit = {}): FileSystemProps =
    FileSystemProps.builder().apply(initializer).build()
