package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.AssemblyManifest

@Generated
public fun assemblyManifest(initializer: AssemblyManifest.Builder.() -> Unit = {}): AssemblyManifest
    = AssemblyManifest.builder().apply(initializer).build()
