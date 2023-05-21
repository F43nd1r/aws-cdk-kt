package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DestroyOptions

@Generated
public fun destroyOptions(initializer: DestroyOptions.Builder.() -> Unit = {}): DestroyOptions =
    DestroyOptions.builder().apply(initializer).build()
