package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DeployOptions

@Generated
public fun deployOptions(initializer: DeployOptions.Builder.() -> Unit = {}): DeployOptions =
    DeployOptions.builder().apply(initializer).build()
