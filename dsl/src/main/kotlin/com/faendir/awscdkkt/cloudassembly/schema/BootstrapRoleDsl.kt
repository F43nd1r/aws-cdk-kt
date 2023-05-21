package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.BootstrapRole

@Generated
public fun bootstrapRole(initializer: BootstrapRole.Builder.() -> Unit = {}): BootstrapRole =
    BootstrapRole.builder().apply(initializer).build()
