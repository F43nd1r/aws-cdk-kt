package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DestroyCommand

@Generated
public fun destroyCommand(initializer: DestroyCommand.Builder.() -> Unit = {}): DestroyCommand =
    DestroyCommand.builder().apply(initializer).build()
