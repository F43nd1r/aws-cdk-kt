package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.CdkCommand

@Generated
public fun cdkCommand(initializer: CdkCommand.Builder.() -> Unit = {}): CdkCommand =
    CdkCommand.builder().apply(initializer).build()
