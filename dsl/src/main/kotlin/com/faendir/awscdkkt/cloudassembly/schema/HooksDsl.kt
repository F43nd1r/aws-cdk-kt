package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.Hooks

@Generated
public fun hooks(initializer: Hooks.Builder.() -> Unit = {}): Hooks =
    Hooks.builder().apply(initializer).build()
