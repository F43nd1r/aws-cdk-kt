package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.IntegManifest

@Generated
public fun integManifest(initializer: IntegManifest.Builder.() -> Unit = {}): IntegManifest =
    IntegManifest.builder().apply(initializer).build()
