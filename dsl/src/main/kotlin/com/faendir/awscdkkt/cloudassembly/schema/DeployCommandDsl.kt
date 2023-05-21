package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DeployCommand

@Generated
public fun deployCommand(initializer: DeployCommand.Builder.() -> Unit = {}): DeployCommand =
    DeployCommand.builder().apply(initializer).build()
