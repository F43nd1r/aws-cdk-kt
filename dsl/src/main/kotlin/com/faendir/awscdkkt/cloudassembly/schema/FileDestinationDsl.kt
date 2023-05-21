package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.FileDestination

@Generated
public fun fileDestination(initializer: FileDestination.Builder.() -> Unit = {}): FileDestination =
    FileDestination.builder().apply(initializer).build()
