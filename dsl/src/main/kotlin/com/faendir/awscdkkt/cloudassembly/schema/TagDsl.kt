package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.Tag

@Generated
public fun tag(initializer: Tag.Builder.() -> Unit = {}): Tag =
    Tag.builder().apply(initializer).build()
