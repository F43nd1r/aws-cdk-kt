package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.MetadataEntry

@Generated
public fun metadataEntry(initializer: MetadataEntry.Builder.() -> Unit = {}): MetadataEntry =
    MetadataEntry.builder().apply(initializer).build()
