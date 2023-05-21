package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.CdkCommands

@Generated
public fun cdkCommands(initializer: CdkCommands.Builder.() -> Unit = {}): CdkCommands =
    CdkCommands.builder().apply(initializer).build()
