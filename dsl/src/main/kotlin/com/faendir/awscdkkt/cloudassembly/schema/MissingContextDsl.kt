package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.MissingContext

@Generated
public fun missingContext(initializer: MissingContext.Builder.() -> Unit = {}): MissingContext =
    MissingContext.builder().apply(initializer).build()
