package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.FileSource

@Generated
public fun fileSource(initializer: FileSource.Builder.() -> Unit = {}): FileSource =
    FileSource.builder().apply(initializer).build()
