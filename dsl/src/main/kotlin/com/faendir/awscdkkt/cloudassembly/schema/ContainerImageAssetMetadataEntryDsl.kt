package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry

@Generated
public
    fun containerImageAssetMetadataEntry(initializer: ContainerImageAssetMetadataEntry.Builder.() -> Unit
    = {}): ContainerImageAssetMetadataEntry =
    ContainerImageAssetMetadataEntry.builder().apply(initializer).build()
