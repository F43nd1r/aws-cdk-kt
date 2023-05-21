package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.FileSystemProps

@Generated
public fun fileSystemProps(initializer: FileSystemProps.Builder.() -> Unit = {}): FileSystemProps =
    FileSystemProps.builder().apply(initializer).build()
