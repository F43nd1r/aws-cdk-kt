package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.AssetManifest

@Generated
public fun assetManifest(initializer: AssetManifest.Builder.() -> Unit = {}): AssetManifest =
    AssetManifest.builder().apply(initializer).build()
